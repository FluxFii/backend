package pe.edu.upc.fluxfi_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.fluxfi_backend.dtos.TransactionDTO;
import pe.edu.upc.fluxfi_backend.entities.Transaction;
import pe.edu.upc.fluxfi_backend.servicesinterfaces.TransactionService;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
    private TransactionService ts;

    @PostMapping
    public void registrar(@RequestBody TransactionDTO dto) {
        ModelMapper m = new ModelMapper();
        Transaction t = m.map(dto, Transaction.class);
        ts.insert(t);

    }

    @PutMapping
    public void modificar(@RequestBody TransactionDTO dto) {
        ModelMapper m = new ModelMapper();
        Transaction t = m.map(dto, Transaction.class);
        ts.insert(t);
    }
    @DeleteMapping
    public void eliminar(@PathVariable("id") int id) {
        ts.delete(id);
    }

    @GetMapping("/{id}")
    public TransactionDTO listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        TransactionDTO dto = m.map(ts.listarId(id), TransactionDTO.class);
        return dto;
    }

    @GetMapping
    public List<TransactionDTO> listar() {
        return ts.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, TransactionDTO.class);
        }).collect(Collectors.toList());
    }

}
