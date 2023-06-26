package br.com.uniamerica.estacionamento.repositories;

import br.com.uniamerica.estacionamento.entities.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaRepository extends JpaRepository<Marca,Long> {
}
