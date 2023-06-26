package br.com.uniamerica.estacionamento.repositories;

import br.com.uniamerica.estacionamento.entities.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface
MovimentacaoRepository extends JpaRepository<Movimentacao,Long> {
}
