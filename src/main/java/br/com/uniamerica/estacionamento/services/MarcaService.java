package br.com.uniamerica.estacionamento.services;

import br.com.uniamerica.estacionamento.dto.MarcaDTO;
import br.com.uniamerica.estacionamento.entities.Marca;
import br.com.uniamerica.estacionamento.repositories.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarcaService {

    @Autowired
    private MarcaRepository marcaRepository;

    public MarcaDTO insert(MarcaDTO dto){
        Marca entity = new Marca();
        entity.setNome(dto.getNome());
        entity.setId(entity.getId());

        entity = marcaRepository.save(entity);

        return new MarcaDTO(entity);
    }
}
