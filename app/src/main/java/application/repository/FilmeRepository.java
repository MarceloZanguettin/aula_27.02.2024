package application.repository;

import org.springframework.data.repository.CrudeRepository;

import application.model.Filme;

public interface FilmeRepository extends CrudeRepository<Filme, Integer> {

    
}