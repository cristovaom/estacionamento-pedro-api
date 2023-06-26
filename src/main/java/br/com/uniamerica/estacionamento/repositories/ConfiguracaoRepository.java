package br.com.uniamerica.estacionamento.repositories;

import br.com.uniamerica.estacionamento.entities.Configuracao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConfiguracaoRepository extends JpaRepository<Configuracao,Long> {
}
