package com.natixis.std.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.natixis.std.model.Student;
import com.natixis.std.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studService;
	
	@GetMapping("/all")
	public List<Student> getAllName() {
		return studService.getAllRecords();
	}
	
	@PostMapping("/add")
	public String addNewStudentRec(@RequestBody Student stud) {
		studService.addNewStudent(stud);
		return "Added........."+stud.getId()+"-"+stud.getName();
	}
	
	@DeleteMapping("/delete")
	public String deleteStudent(@RequestParam int id) {
		studService.removeStud(id);
		return "Removed........"+id;
	}

	@PutMapping("/update")
	public String updateStudentRec(@RequestBody Student stud) {
		return studService.updateStudent(stud);
	}
}
