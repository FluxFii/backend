package pe.edu.upc.fluxfi_backend.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.fluxfi_backend.entities.TransactionType;
import pe.edu.upc.fluxfi_backend.repositories.TrasactionTypeRepository;
import pe.edu.upc.fluxfi_backend.servicesinterfaces.TransactionTypeService;

import java.util.List;

@Service
public class TransactionTypeServiceImplement implements TransactionTypeService {
    @Autowired
    private TrasactionTypeRepository ttR;

    @Override
    public void insert(TransactionType transactionType) {
        ttR.save(transactionType);
    }

    @Override
    public void delete(int idTransactionType) {
        ttR.deleteById(idTransactionType);
    }

    @Override
    public TransactionType listarId(int idTransactionType) {
        return ttR.findById(idTransactionType).orElse(new TransactionType());
    }

    @Override
    public List<TransactionType> list() {
        return ttR.findAll();
    }

}
