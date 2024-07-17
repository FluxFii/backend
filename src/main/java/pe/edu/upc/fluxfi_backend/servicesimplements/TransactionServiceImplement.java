package pe.edu.upc.fluxfi_backend.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.fluxfi_backend.entities.Transaction;
import pe.edu.upc.fluxfi_backend.repositories.TransactionRepository;
import pe.edu.upc.fluxfi_backend.servicesinterfaces.TransactionService;

import java.util.List;

@Service

public class TransactionServiceImplement  implements TransactionService {

    @Autowired
    private TransactionRepository tr;

    @Override
    public void insert(Transaction transaction) {
        tr.save(transaction);
    }

    @Override
    public void delete(int idTransaction) {
        tr.deleteById(idTransaction);
    }

    @Override
    public Transaction listarId(int idTransaction) {
        return tr.findById(idTransaction).orElse(new Transaction());
    }

    @Override
    public List<Transaction> list() {
        return tr.findAll();
    }
}
