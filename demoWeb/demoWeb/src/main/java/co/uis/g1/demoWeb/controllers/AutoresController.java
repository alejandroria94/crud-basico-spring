/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.uis.g1.demoWeb.controllers;

import co.uis.g1.demoWeb.entities.AutorEntity;
import co.uis.g1.demoWeb.services.AutorService;
import java.util.List;
import java.util.Optional;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author CENTIC
 */
@RestController
@RequestMapping("/autores")
@AllArgsConstructor
public class AutoresController {

    @GetMapping("/test")
    public String holaMundo() {
        return "Hola Mundo todo OK";
    }
    

    private final AutorService autoresService;

    @GetMapping("/listar")
    public List<AutorEntity> getAllAutores() {
        return autoresService.findAll();
    }

    @GetMapping("/{codigo}")
    public Optional<AutorEntity> getAutorById(@PathVariable String codigo) {
        return autoresService.findById(codigo);
    }

    @PostMapping
    public AutorEntity createAutor(@RequestBody AutorEntity autor) {
        return autoresService.save(autor);
    }

    @PutMapping("/{codigo}")
    public AutorEntity updateAutor(@PathVariable String codigo, @RequestBody AutorEntity autor) {
        autor.setCodigo(codigo);
        return autoresService.save(autor);
    }

    @DeleteMapping("/{codigo}")
    public void deleteAutor(@PathVariable String codigo) {
        autoresService.deleteById(codigo);
    }

}
