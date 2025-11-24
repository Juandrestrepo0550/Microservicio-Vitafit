package microservicioVitafit.Vitafit.controllers;

import microservicioVitafit.Vitafit.models.Categoria;
import microservicioVitafit.Vitafit.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
@CrossOrigin("*")
public class CategoriaController {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @PostMapping("/crear")
    public Categoria crearCategoria(@RequestBody Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @GetMapping("/listar")
    public List<Categoria> listarCategorias() {
        return categoriaRepository.findAll();
    }
}
