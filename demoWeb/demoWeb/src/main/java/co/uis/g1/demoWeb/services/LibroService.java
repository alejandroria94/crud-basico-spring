package co.uis.g1.demoWeb.services;

import co.uis.g1.demoWeb.entities.AutorEntity;
import co.uis.g1.demoWeb.entities.LibroEntity;
import co.uis.g1.demoWeb.repositories.AutorRepository;
import co.uis.g1.demoWeb.repositories.LibroRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class LibroService {


    private final LibroRepository libroRepository;

    public List<LibroEntity> findAll() {
        return libroRepository.findAll();
    }


}