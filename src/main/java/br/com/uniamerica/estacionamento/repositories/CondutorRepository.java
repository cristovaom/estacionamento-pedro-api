package br.com.uniamerica.estacionamento.repositories;

import br.com.uniamerica.estacionamento.entities.Condutor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CondutorRepository extends JpaRepository<Condutor,Long> {
}
