package br.com.uniamerica.estacionamento.controllers;

import br.com.uniamerica.estacionamento.dto.MarcaDTO;
import br.com.uniamerica.estacionamento.dto.ModeloMarcaDTO;
import br.com.uniamerica.estacionamento.services.MarcaService;
import br.com.uniamerica.estacionamento.services.ModeloService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/api/modelos")
public class ModeloController {

    @Autowired
    private ModeloService modeloService;
    @PostMapping
    public ResponseEntity<ModeloMarcaDTO> insert(@Valid @RequestBody ModeloMarcaDTO dto){
        dto = modeloService.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }
}
