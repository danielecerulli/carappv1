package it.danielecerulli.carapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.danielecerulli.carapp.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
