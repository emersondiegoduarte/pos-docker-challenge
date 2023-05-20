package com.docker.dockerchallenge.service.impl;

import com.docker.dockerchallenge.entity.Linguagens;
import com.docker.dockerchallenge.repository.LinguagensRepository;
import com.docker.dockerchallenge.service.LinguagemService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LinguagemServiceImpl implements LinguagemService {

    private final LinguagensRepository linguagensRepository;
    @Override
    public List<Linguagens> findAll() {
        return linguagensRepository.findAll();
    }
}
