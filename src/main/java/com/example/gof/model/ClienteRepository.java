package com.example.gof.model;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, String> {

    Optional<Cliente> findById(Long id);

    void deleteById(Long id);
    
}