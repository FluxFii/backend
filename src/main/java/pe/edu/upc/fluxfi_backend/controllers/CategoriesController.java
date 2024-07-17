package pe.edu.upc.fluxfi_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.fluxfi_backend.dtos.CategoriesDTO;
import pe.edu.upc.fluxfi_backend.entities.Categories;
import pe.edu.upc.fluxfi_backend.servicesinterfaces.CategoriesService;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/categories")
public class CategoriesController  {
    @Autowired
    private CategoriesService cs;

    @PostMapping
    public void registrar(@RequestBody CategoriesDTO dto) {
        ModelMapper m = new ModelMapper();
        Categories r = m.map(dto, Categories.class);
        cs.insert(r);
    }

    @PutMapping
    public void modificar(@RequestBody CategoriesDTO dto) {
        ModelMapper m = new ModelMapper();
        Categories r = m.map(dto, Categories.class);
        cs.insert(r);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        cs.delete(id);
    }

    @GetMapping("/{id}")
    public CategoriesDTO listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        CategoriesDTO dto = m.map(cs.listarId(id), CategoriesDTO.class);
        return dto;
    }

    @GetMapping
    public List<CategoriesDTO> listar() {
        return cs.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, CategoriesDTO.class);
        }).collect(Collectors.toList());
    }
}
