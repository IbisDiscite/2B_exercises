package com.techprimers.jpa.springdatajpahibernateexample.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/exercises")
public class Resource {

    private ExerciseRepository exerciseRepository;

    public Resource(ExerciseRepository exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }


    @GetMapping("/")
    public List<Exercises> all() {


        return exerciseRepository.findAll();
    }
    @GetMapping("/leccion/{id}")
    public  List<Exercises> leccion(@PathVariable int id){
        return exerciseRepository.getByLeccion(id);
    }

    @GetMapping("/create")
    public List<Exercises> users() {
        Exercises exercises1= new Exercises(1,"enunciado","opc1","opc2","rta");
        Exercises exercises2= new Exercises(1,"enunciadoa","opc1a","opc2a","rtaa");
        Exercises exercises3= new Exercises(2,"enunciado","opc1","opc2","rta");
        Exercises exercises4= new Exercises(3,"enunciado","opc1","opc2","rta");


        exerciseRepository.save(exercises1);
        exerciseRepository.save(exercises2);
        exerciseRepository.save(exercises3);
        exerciseRepository.save(exercises4);

        return exerciseRepository.findAll();
    }
}
