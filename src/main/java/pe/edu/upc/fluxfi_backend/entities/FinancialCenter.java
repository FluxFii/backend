package pe.edu.upc.fluxfi_backend.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "financialCenter")
public class FinancialCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    public FinancialCenter() {
    }

    public FinancialCenter(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
