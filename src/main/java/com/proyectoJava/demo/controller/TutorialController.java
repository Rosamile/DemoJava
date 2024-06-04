package com.proyectoJava.demo.controller;

import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;
import java.util.List;
import java.util.Optional;

import aj.org.objectweb.asm.commons.TryCatchBlockSorter;
import com.proyectoJava.demo.dto.TutorialDto;
import com.proyectoJava.demo.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proyectoJava.demo.model.Tutorial;
import  com.proyectoJava.demo.repository.TutorialRepository;


@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")

public class TutorialController {
    @Autowired
    TutorialRepository tutorialRepository;

    @Autowired
    TutorialService tutorialService;

    @PostMapping("/tutorials")
    public ResponseEntity<List<Tutorial>> postAllTutorial(@RequestBody(required = true)TutorialDto tutorialDto) {
        tutorialService.getAll();
    return new ResponseEntity<>(HttpStatus.OK);
    }


     @GetMapping("/tutorials")
    public ResponseEntity<List<Tutorial>> getAllTutorials(@RequestParam(required = false) String title) {
        var tutorials = tutorialService.getAll();
        return new ResponseEntity<>(tutorials, HttpStatus.OK);
    }

   @GetMapping("/tutorials/{id}")
    public ResponseEntity<Tutorial> getTutorialById(@PathVariable("id") long id) {
        return new ResponseEntity<>(tutorials, HttpStatus.OK);
    }

   /* @DeleteMapping("/tutorials")
    public ResponseEntity<HttpStatus> deleteAllTutorials() {
    }

    @GetMapping("/tutorials/published")
    public ResponseEntity<List<Tutorial>> findByPublished() {
    }*/


}
