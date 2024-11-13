package co.uis.g1.demoWeb.repositories;

import co.uis.g1.demoWeb.entities.LibroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends JpaRepository<LibroEntity, String> {

}
