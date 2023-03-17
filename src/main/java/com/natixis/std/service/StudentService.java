package com.natixis.std.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.natixis.std.model.Student;
import com.natixis.std.repo.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo studRepo;
	
	public List<Student> getAllRecords() {
		return studRepo.findAll();
	}

	public void addNewStudent(Student stud) {
		
		studRepo.save(stud);
		
	}

	public void removeStud(int id) {
		studRepo.deleteById(id);;
		
	}

	public String updateStudent(Student stud) {
		try {
		Student recordstud=studRepo.findById(stud.getId()).get();
		if(recordstud !=null)
			studRepo.save(stud);
			return "Updated successfull..........";
		}
		catch (Exception e)
		{
			return "Record is not found...!!!";
		}
		
	}

}
