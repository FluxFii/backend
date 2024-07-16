package pe.edu.upc.fluxfi_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.fluxfi_backend.entities.FinancialCenter;

@Repository
public interface IFinancialCenterRepository extends JpaRepository<FinancialCenter,Integer> {
}
