package br.com.uniamerica.estacionamento.services;

import br.com.uniamerica.estacionamento.dto.MarcaDTO;
import br.com.uniamerica.estacionamento.dto.ModeloDTO;
import br.com.uniamerica.estacionamento.dto.ModeloMarcaDTO;
import br.com.uniamerica.estacionamento.entities.Marca;
import br.com.uniamerica.estacionamento.entities.Modelo;
import br.com.uniamerica.estacionamento.repositories.MarcaRepository;
import br.com.uniamerica.estacionamento.repositories.ModeloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModeloService {

    @Autowired
    private ModeloRepository modeloRepository;
    @Autowired
    private MarcaRepository marcaRepository;

    public ModeloMarcaDTO insert(ModeloMarcaDTO dto){


        Modelo entity = new Modelo();
        entity.setNome(dto.getNome());
        entity.setCadastro(dto.getCadastro());
        entity.setId(dto.getId());

        Marca marca = marcaRepository.getReferenceById(dto.getMarca().getId());

        entity.setMarca(marca);

        entity = modeloRepository.save(entity);

        return new ModeloMarcaDTO(entity);
    }
}
