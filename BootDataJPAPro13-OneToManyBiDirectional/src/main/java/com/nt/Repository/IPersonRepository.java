package com.nt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.Entity.Person;

public interface IPersonRepository extends JpaRepository<Person, Integer>{

}
