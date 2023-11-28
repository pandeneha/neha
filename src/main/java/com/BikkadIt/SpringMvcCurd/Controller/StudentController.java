package com.BikkadIt.SpringMvcCurd.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.servlet.ModelAndView;

import com.BikkadIt.SpringMvcCurd.Service.StudentServiceI;
import com.BikkadIt.SpringMvcCurd.model.Student;

@Controller
public class StudentController {

	@Autowired
	private StudentServiceI studentServiceI;
	
	@GetMapping("/welcomeStudent")
	public String loadForm() {
		return "welcome1";
		
	}
	@GetMapping("/saveStudent")
	public ModelAndView saveStudent(Student stu) {
		
		boolean saveStudent = studentServiceI.saveStudent(stu);
		if(saveStudent) {
			ModelAndView mav = new ModelAndView();
			mav.addObject("STUSUCC", "Student Save Successfully");
			mav.setViewName("regSucc");
			return mav;
		}else{
		ModelAndView mav = new ModelAndView();
		mav.addObject("STUFAIL", "Student Not Saved");
		mav.setViewName("regFail");
		return mav;
		}
	}
	
	@GetMapping("/getAllStudent")
    public String getAllStudent(Model model){
	List<Student> allStudent = studentServiceI.getAllStudent();
	model.addAttribute("ALLSTUDENT", allStudent);
	return "getAllStu";
		
	}
	@GetMapping("/updateStudent")
	public ModelAndView updateStudent(Student stu) {
		System.out.println(stu);
		boolean updateStudent = studentServiceI.updateStudent(stu);
		
		if(updateStudent) {
			ModelAndView mav = new ModelAndView();
			mav.addObject("STUUPDATE", "Student updated Successfully");
			mav.setViewName("upDataSucc");
			return mav;
		}else{
		ModelAndView mav = new ModelAndView();
		mav.addObject("STUNOTUPDATE", "Student Not Updated Successfully");
		mav.setViewName("upDateFail");
		return mav;
		}
		
	}
	@GetMapping("/deleteAllStu")
	public ModelAndView deleteAllStu() {
		boolean deleteAllStu = studentServiceI.deleteAllStu();
		if (deleteAllStu) {
			ModelAndView mav = new ModelAndView();
			mav.addObject("StuDelete", "Student Deleted Successfully");
			mav.setViewName("deleteSucc");
			return mav;
		} else {
			ModelAndView mav = new ModelAndView();
			mav.addObject("StuNotDelete", "Student Not Deleted");
			mav.setViewName("deleteFail");
			return mav;
		}
		}
		
	}
	

