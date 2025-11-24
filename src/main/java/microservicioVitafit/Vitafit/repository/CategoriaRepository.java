package microservicioVitafit.Vitafit.repository;

import microservicioVitafit.Vitafit.models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}