package br.com.uniamerica.estacionamento.repositories;

import br.com.uniamerica.estacionamento.entities.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<Marca,Long> {
}
