package br.com.uniamerica.estacionamento.repositories;

import br.com.uniamerica.estacionamento.entities.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculoRepository extends JpaRepository<Veiculo,Long> {
}
