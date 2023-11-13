package com.demo.model.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Client;
import com.demo.model.GENRE;

import java.util.List;
import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client,Integer> {
    
    Optional<List<Client>> findByNomOrPrenom(String nom,String prenom);
	Optional<Client>  findByEmail(String email);
	Optional<List<Client>> findByAgeGreaterThan(int age);
	Optional<List<Client>> findByAgeLessThanEqual(int age);
	Optional<List<Client>> findByGenre(GENRE genre);
}