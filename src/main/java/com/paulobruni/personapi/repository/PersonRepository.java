package com.paulobruni.personapi.repository;

import com.paulobruni.personapi.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
