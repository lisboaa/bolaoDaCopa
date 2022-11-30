package com.example.bolaoDaCopa.repositories;
import com.example.bolaoDaCopa.models.Times;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimesRepository extends JpaRepository<Times, Long> {
}