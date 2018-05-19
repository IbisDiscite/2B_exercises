package com.techprimers.jpa.springdatajpahibernateexample.resource;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ExercisesService {
    private static List<Exercises> exercises= new ArrayList<>();


    public List<Exercises> getByLeccion(int id){
        List<Exercises> approved= new ArrayList<>();
        for(Exercises ex:exercises){
            if(ex.getLeccion()==id)approved.add(ex);
        }
        return approved;
    }
}
