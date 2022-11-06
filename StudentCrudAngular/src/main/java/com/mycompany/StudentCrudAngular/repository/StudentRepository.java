package com.mycompany.StudentCrudAngular.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.StudentCrudAngular.entites.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer> {

}
