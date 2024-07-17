package pe.edu.upc.fluxfi_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.fluxfi_backend.dtos.TransactionTypeDTO;
import pe.edu.upc.fluxfi_backend.entities.TransactionType;
import pe.edu.upc.fluxfi_backend.servicesinterfaces.TransactionTypeService;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class TransactionTypeController {

    @Autowired
    private TransactionTypeService ts;

    @PostMapping
    public void registrar(@RequestBody TransactionTypeDTO dto) {
        ModelMapper m = new ModelMapper();
        TransactionType t = m.map(dto, TransactionType.class);
        ts.insert(t);

    }

    @PutMapping
    public void modificar(@RequestBody TransactionTypeDTO dto) {
        ModelMapper m = new ModelMapper();
        TransactionType t = m.map(dto, TransactionType.class);
        ts.insert(t);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        ts.delete(id);
    }

    @GetMapping("/{id}")
    public TransactionTypeDTO listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        TransactionTypeDTO dto = m.map(ts.listarId(id), TransactionTypeDTO.class);
        return dto;
    }

    @GetMapping
    public List<TransactionTypeDTO> listar() {
        return ts.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, TransactionTypeDTO.class);
        }).collect(Collectors.toList());
    }

}
