/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.uis.g1.demoWeb.controllers;

import co.uis.g1.demoWeb.entities.CategoriaEntity;
import co.uis.g1.demoWeb.entities.LibroEntity;
import co.uis.g1.demoWeb.services.CategoriaService;
import co.uis.g1.demoWeb.services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 * @author CENTIC
 */
@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @GetMapping("/test")
    public String holaMundo() {
        return "Hola Mundo todo OK";
    }
    
     @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/listar")
    public List<CategoriaEntity> listarCategorias() {
        return categoriaService.findAll();
    }



}
