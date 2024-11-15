package co.uis.g1.demoWeb.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "autores")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AutorEntity {

    @Id
    @Column(name = "codigo", nullable = false, unique = true, length = 100)
    private String codigo;

    @Column(name = "nombre", length = 100)
    private String nombre;

    @Column(name = "nacionalidad", length = 100)
    private String nacionalidad;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true,fetch = FetchType.LAZY)
    @JoinColumn(name = "codigo_autor")
    private List<LibroEntity> libros;
}