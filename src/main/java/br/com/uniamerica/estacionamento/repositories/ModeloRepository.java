package br.com.uniamerica.estacionamento.repositories;

import br.com.uniamerica.estacionamento.entities.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModeloRepository extends JpaRepository<Modelo,Long> {
}
