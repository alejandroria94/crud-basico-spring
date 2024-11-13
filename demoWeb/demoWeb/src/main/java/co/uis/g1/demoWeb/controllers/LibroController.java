/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.uis.g1.demoWeb.controllers;

import co.uis.g1.demoWeb.entities.AutorEntity;
import co.uis.g1.demoWeb.entities.LibroEntity;
import co.uis.g1.demoWeb.services.LibroService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author CENTIC
 */
@RestController
@RequestMapping("/libros")
@AllArgsConstructor
public class LibroController {

    @GetMapping("/test")
    public String holaMundo() {
        return "Hola Mundo todo OK";
    }
    

    private final LibroService libroService;

    @GetMapping("/listar")
    public List<LibroEntity> listarLibros() {
        return libroService.findAll();
    }



}
