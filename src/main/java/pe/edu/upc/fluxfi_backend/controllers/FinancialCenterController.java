package pe.edu.upc.fluxfi_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.fluxfi_backend.dtos.FinancialCenterDTO;
import pe.edu.upc.fluxfi_backend.entities.FinancialCenter;
import pe.edu.upc.fluxfi_backend.servicesinterfaces.IFinancialCenterService;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/centrosfinancieros")
public class FinancialCenterController {
    @Autowired
    private IFinancialCenterService fcS;

    @PostMapping
    public void registrar(@RequestBody FinancialCenterDTO dto) {
        ModelMapper m = new ModelMapper();
        FinancialCenter r = m.map(dto, FinancialCenter.class);
        fcS.insert(r);
    }

    @PutMapping
    public void modificar(@RequestBody FinancialCenterDTO dto) {
        ModelMapper m = new ModelMapper();
        FinancialCenter r = m.map(dto, FinancialCenter.class);
        fcS.insert(r);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        fcS.delete(id);
    }

    @GetMapping("/{id}")
    public FinancialCenterDTO listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        FinancialCenterDTO dto = m.map(fcS.listarId(id), FinancialCenterDTO.class);
        return dto;
    }

    @GetMapping
    public List<FinancialCenterDTO> listar() {
        return fcS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, FinancialCenterDTO.class);
        }).collect(Collectors.toList());
    }
}
