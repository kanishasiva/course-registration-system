package com.example.Course.Registration.System.repository;

import com.example.Course.Registration.System.model.Courseregistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Courseregistryrepo extends JpaRepository<Courseregistry,Integer> {

}
