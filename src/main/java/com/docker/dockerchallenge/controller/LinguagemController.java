package com.docker.dockerchallenge.controller;

import com.docker.dockerchallenge.entity.Linguagens;
import com.docker.dockerchallenge.service.LinguagemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("")
@RequiredArgsConstructor
public class LinguagemController {

    private final LinguagemService linguagemService;

    @GetMapping
    public ResponseEntity<List<Linguagens>> getAll(){
        return ResponseEntity.ok(linguagemService.findAll());
    }
}
