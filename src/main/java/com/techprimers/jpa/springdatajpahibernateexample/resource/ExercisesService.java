package com.techprimers.jpa.springdatajpahibernateexample.resource;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ExercisesService {
    private static List<Exercises> exercises= new ArrayList<>();

    static {
        Exercises exercises1= new Exercises(1,"enunciado","opc1","opc2","rta");
        Exercises exercises2= new Exercises(1,"enunciadoa","opc1a","opc2a","rtaa");
        Exercises exercises3= new Exercises(2,"enunciado","opc1","opc2","rta");
        Exercises exercises4= new Exercises(3,"enunciado","opc1","opc2","rta");

    }

    public List<Exercises> getByLeccion(int id){
        List<Exercises> approved= new ArrayList<>();
        for(Exercises ex:exercises){
            if(ex.getLeccion()==id)approved.add(ex);
        }
        return approved;
    }
}
