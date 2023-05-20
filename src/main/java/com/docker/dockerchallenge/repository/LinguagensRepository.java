package com.docker.dockerchallenge.repository;

import com.docker.dockerchallenge.entity.Linguagens;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinguagensRepository extends JpaRepository<Linguagens,Long> {
}
