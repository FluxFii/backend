package pe.edu.upc.fluxfi_backend.servicesinterfaces;

import pe.edu.upc.fluxfi_backend.entities.FinancialCenter;

import java.util.List;

public interface IFinancialCenterService {
    public void insert(FinancialCenter financialCenter);

    public List<FinancialCenter> list();

    public void delete(int idFinancialCenter);

    public FinancialCenter listarId(int idFinancialCenter);
}
