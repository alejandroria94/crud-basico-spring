package co.uis.g1.demoWeb.services;

import co.uis.g1.demoWeb.entities.AutorEntity;
import co.uis.g1.demoWeb.repositories.AutorRepository;
import java.util.List;
import java.util.Optional;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AutorService {


    private final AutorRepository autoresRepository;

    public List<AutorEntity> findAll() {
        return autoresRepository.findAll();
    }

    public Optional<AutorEntity> findById(String codigo) {
        return autoresRepository.findById(codigo);
    }

    public AutorEntity save(AutorEntity autor) {
        return autoresRepository.save(autor);
    }

    public void deleteById(String codigo) {
        autoresRepository.deleteById(codigo);
    }
}