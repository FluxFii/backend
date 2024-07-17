package pe.edu.upc.fluxfi_backend.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "amount", nullable = false)
    private double amount;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "description", nullable = false, length = 100)
    private String description;

    @ManyToOne
    @JoinColumn(name = "idFinancialCenter")
    private FinancialCenter financialCenter;

    @ManyToOne
    @JoinColumn(name = "idCategory")
    private Categories category;

    @ManyToOne
    @JoinColumn(name = "idTransactionType")
    private TransactionType transactionType;

    public Transaction() {
    }

    public Transaction(int id, double amount, LocalDate date, String description, FinancialCenter financialCenter, Categories category, TransactionType transactionType) {
        this.id = id;
        this.amount = amount;
        this.date = date;
        this.description = description;
        this.financialCenter = financialCenter;
        this.category = category;
        this.transactionType = transactionType;
    }

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
