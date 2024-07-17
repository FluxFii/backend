package pe.edu.upc.fluxfi_backend.dtos;

import pe.edu.upc.fluxfi_backend.entities.Categories;
import pe.edu.upc.fluxfi_backend.entities.FinancialCenter;
import pe.edu.upc.fluxfi_backend.entities.TransactionType;

import java.time.LocalDate;

public class TransactionDTO {

    private int id;

    private double amount;

    private LocalDate date;

    private String description;

    private FinancialCenter financialCenter;

    private Categories category;

    private TransactionType transactionType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FinancialCenter getFinancialCenter() {
        return financialCenter;
    }

    public void setFinancialCenter(FinancialCenter financialCenter) {
        this.financialCenter = financialCenter;
    }

    public Categories getCategory() {
        return category;
    }

    public void setCategory(Categories category) {
        this.category = category;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }
}
