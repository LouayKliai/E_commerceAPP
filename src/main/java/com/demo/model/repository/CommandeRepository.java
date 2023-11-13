package com.demo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;
import com.demo.model.Commande;
import com.demo.model.Client;
import com.demo.model.Produit;

public interface CommandeRepository extends JpaRepository<Commande, Integer> {

    Optional<List<Commande>> findByProduits(int id_produit);
    Optional<List<Commande>> findByClients(int id_client);
    Optional<List<Commande>> findByQuantiteGreaterThanEqual(int quantite);
    Optional<List<Commande>> findByQuantiteLessThanEqual(int quantite);
}
