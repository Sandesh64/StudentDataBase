package com.natixis.std.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.natixis.std.model.Student;


public interface StudentRepo extends JpaRepository<Student, Integer> {



}
