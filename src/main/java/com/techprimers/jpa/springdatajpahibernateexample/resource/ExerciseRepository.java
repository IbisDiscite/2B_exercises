package com.techprimers.jpa.springdatajpahibernateexample.resource;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

public interface ExerciseRepository extends JpaRepository <Exercises, Integer> {

    List<Exercises> getByLeccion(int id);

}
