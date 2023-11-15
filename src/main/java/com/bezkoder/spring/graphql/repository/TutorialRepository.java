package com.bezkoder.spring.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.spring.graphql.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

}
