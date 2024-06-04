package com.proyectoJava.demo.service;

import com.proyectoJava.demo.model.Tutorial;
import java.util.List;
import java.util.Optional;

public interface TutorialService {

    public List<Tutorial> getAll();

    public Optional<Tutorial> finById(int Id);

    public Tutorial save(Tutorial tutorial);

}



