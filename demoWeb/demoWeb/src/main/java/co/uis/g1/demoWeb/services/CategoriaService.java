package co.uis.g1.demoWeb.services;

import co.uis.g1.demoWeb.entities.CategoriaEntity;
import co.uis.g1.demoWeb.entities.LibroEntity;
import co.uis.g1.demoWeb.repositories.CategoriaRepository;
import co.uis.g1.demoWeb.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<CategoriaEntity> findAll() {
        return categoriaRepository.findAll();
    }


}