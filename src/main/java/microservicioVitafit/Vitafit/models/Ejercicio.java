package microservicioVitafit.Vitafit.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ejercicios")
public class Ejercicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
    private String aporte_muscular;

    private LocalDateTime fecha_creacion = LocalDateTime.now();
    private LocalDateTime ultima_actualizacion = LocalDateTime.now();

    public Ejercicio() {
    }

    // GETTERS y SETTERS obligatorios

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAporte_muscular() {
        return aporte_muscular;
    }

    public void setAporte_muscular(String aporte_muscular) {
        this.aporte_muscular = aporte_muscular;
    }

    public LocalDateTime getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(LocalDateTime fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public LocalDateTime getUltima_actualizacion() {
        return ultima_actualizacion;
    }

    public void setUltima_actualizacion(LocalDateTime ultima_actualizacion) {
        this.ultima_actualizacion = ultima_actualizacion;
    }
}

