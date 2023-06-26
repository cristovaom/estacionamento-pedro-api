package br.com.uniamerica.estacionamento.repositories;

import br.com.uniamerica.estacionamento.entities.Condutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CondutorRepository extends JpaRepository<Condutor,Long> {
}
