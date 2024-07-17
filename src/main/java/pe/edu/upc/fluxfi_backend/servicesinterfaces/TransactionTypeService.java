package pe.edu.upc.fluxfi_backend.servicesinterfaces;

import pe.edu.upc.fluxfi_backend.entities.TransactionType;

import java.util.List;

public interface TransactionTypeService {

    public void insert(TransactionType transactionType);

    public void delete(int idTransactionType);

    public TransactionType listarId(int idTransactionType);

    public List<TransactionType> list();

}
