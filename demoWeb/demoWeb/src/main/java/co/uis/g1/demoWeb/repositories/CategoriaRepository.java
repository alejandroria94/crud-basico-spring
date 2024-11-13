package co.uis.g1.demoWeb.repositories;

import co.uis.g1.demoWeb.entities.AutorEntity;
import co.uis.g1.demoWeb.entities.CategoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaEntity, String> {
}