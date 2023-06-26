package br.com.uniamerica.estacionamento.services;

import br.com.uniamerica.estacionamento.dto.MarcaDTO;
import br.com.uniamerica.estacionamento.entities.Marca;
import br.com.uniamerica.estacionamento.repositories.MarcaRepository;
import br.com.uniamerica.estacionamento.services.exceptions.DatabaseException;
import br.com.uniamerica.estacionamento.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MarcaService {

    @Autowired
    private MarcaRepository marcaRepository;

    @Transactional(readOnly = true)
    public MarcaDTO findById(Long id){
        Marca marca = marcaRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Recurso não encontrado!"));
        return new MarcaDTO(marca);
    }

    @Transactional
    public MarcaDTO insert(MarcaDTO dto){
        Marca entity = new Marca();
        entity.setNome(dto.getNome());
        entity.setId(entity.getId());

        entity = marcaRepository.save(entity);

        return new MarcaDTO(entity);
    }

    @Transactional(readOnly = true)
    public List<Marca> listaCompleta() {
        return marcaRepository.findAll();
    }

    @Transactional
    public MarcaDTO update(Long id,MarcaDTO marcaDTO){
        try{
            Marca marca = marcaRepository.getReferenceById(id);
            copyDtoToEntity(marcaDTO,marca);
            marca = marcaRepository.save(marca);
            return new MarcaDTO(marca);
        }catch (EntityNotFoundException e){
            throw new ResourceNotFoundException("Recurso não encontrado!");
        }
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public void delete(Long id){
        if(!marcaRepository.existsById(id)){
            throw new ResourceNotFoundException("Recurso não encontrado!");
        }
        try{
            marcaRepository.deleteById(id);
        }catch (DataIntegrityViolationException e){
            throw new DatabaseException("Falha de integridade referencial!");
        }
    }

    private void copyDtoToEntity(MarcaDTO marcaDTO, Marca marca) {
        marca.setNome(marcaDTO.getNome());
        marca.setCadastro(marcaDTO.getCadastro());
        marca.setEdicao(marcaDTO.getEdicao());
        marca.setAtivo(marcaDTO.isAtivo());
    }

}
