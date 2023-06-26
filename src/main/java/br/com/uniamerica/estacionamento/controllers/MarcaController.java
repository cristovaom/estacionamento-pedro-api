package br.com.uniamerica.estacionamento.controllers;

import br.com.uniamerica.estacionamento.dto.MarcaDTO;
import br.com.uniamerica.estacionamento.services.MarcaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.awt.print.Pageable;
import java.net.URI;

@RestController
@RequestMapping(value = "/api/marcas")
public class MarcaController {

    @Autowired
    private MarcaService marcaService;
    @GetMapping(value = "/{id}")
    public ResponseEntity<MarcaDTO> findById(@PathVariable Long id){
        MarcaDTO marcaDTO = marcaService.findById(id);
        return ResponseEntity.ok(marcaDTO);
    }
   @GetMapping("/lista")
    public ResponseEntity<?> listaCompleta(){

            return ResponseEntity.ok(marcaService.listaCompleta());

    }

    @PostMapping
    public ResponseEntity<MarcaDTO> insert(@Valid @RequestBody MarcaDTO marcaDTO){
        marcaDTO = marcaService.insert(marcaDTO);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(marcaDTO.getId()).toUri();
        return ResponseEntity.created(uri).body(marcaDTO);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<MarcaDTO> update(@Valid @PathVariable Long id, @RequestBody MarcaDTO marcaDTO){
        marcaDTO = marcaService.update(id,marcaDTO);
        return ResponseEntity.ok(marcaDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<MarcaDTO> delete(@PathVariable Long id){
        marcaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
