package co.uis.g1.demoWeb.repositories;

import co.uis.g1.demoWeb.entities.AutorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<AutorEntity, String> {
}