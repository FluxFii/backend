package pe.edu.upc.fluxfi_backend.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.fluxfi_backend.entities.FinancialCenter;
import pe.edu.upc.fluxfi_backend.repositories.IFinancialCenterRepository;
import pe.edu.upc.fluxfi_backend.servicesinterfaces.IFinancialCenterService;

import java.util.List;

@Service
public class FinancialCenterServiceImplement implements IFinancialCenterService {
    @Autowired
    private IFinancialCenterRepository fcR;
    @Override
    public void insert(FinancialCenter financialCenter) {
        fcR.save(financialCenter);
    }

    @Override
    public List<FinancialCenter> list() {
        return fcR.findAll();
    }

    @Override
    public void delete(int idFinancialCenter) {
        fcR.deleteById(idFinancialCenter);
    }

    @Override
    public FinancialCenter listarId(int idFinancialCenter) {
        return fcR.findById(idFinancialCenter).orElse(new FinancialCenter());
    }
}
