package com.mycompany.StudentCrudAngular.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.StudentCrudAngular.entites.Student;
import com.mycompany.StudentCrudAngular.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
private StudentRepository studentRepository;
	public Student registerStudent(Student student) {
	return 	studentRepository.save(student);
	}
	public List<Student> getStudents(){
		return(List<Student>) studentRepository.findAll();
		 
	}
	
	public void deleteStudent(Integer id) {
		studentRepository.deleteById(id);
	}
}
