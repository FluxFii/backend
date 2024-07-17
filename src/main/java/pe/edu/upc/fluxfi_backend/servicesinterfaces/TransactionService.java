package pe.edu.upc.fluxfi_backend.servicesinterfaces;

import pe.edu.upc.fluxfi_backend.entities.Transaction;

import java.util.List;

public interface TransactionService {

    public void insert(Transaction transaction);

    public void delete(int idTransaction);

    public Transaction listarId(int idTransaction);

    public List<Transaction> list();

}
