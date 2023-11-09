package com.gfour.ccoms.repositories;

import org.springframework.data.repository.CrudRepository;

import com.gfour.ccoms.entities.Student;

public interface StudentRepo extends CrudRepository<Student, Integer> {
}
