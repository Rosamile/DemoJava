package com.proyectoJava.demo.service.impl;

import com.proyectoJava.demo.model.Tutorial;
import com.proyectoJava.demo.repository.TutorialRepository;
import com.proyectoJava.demo.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TutorialServiceImpl implements TutorialService {

    @Autowired
    TutorialRepository tutorialRepository;

    private final List<Tutorial> tutorials = new ArrayList<>();

    @Override
    public List<Tutorial> getAll() {
        if(tutorials.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NO_CONTENT, "No found tutorials");
        }
        return tutorials;
    }

    @Override
    public List<Tutorial> getTutorialById(int id){
        Optional<Tutorial> tutorialData = tutorialRepository.findById(int id);
        if(tutorialData.isPresent()){
            return tutorialData;
        } else {
            return ResponseStatus(HttpStatus.NO_CONTENT, "Id not found");
        }
    }

    @Override
    public Tutorial save(Tutorial tutorial) {
        return null;
    }
}
