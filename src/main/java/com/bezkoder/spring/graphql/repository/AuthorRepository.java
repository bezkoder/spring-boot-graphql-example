package com.bezkoder.spring.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.spring.graphql.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}