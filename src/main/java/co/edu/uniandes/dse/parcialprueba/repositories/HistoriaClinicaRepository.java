package co.edu.uniandes.dse.parcialprueba.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import co.edu.uniandes.dse.parcialprueba.entities.HistoriaClinicaEntity;
import java.util.List;

@Repository
public class HistoriaClinicaRepository extends JpaRepository<HistoriaClinicaEntity, Long> {
    List<HistoriaClinicaEntity> findByfechaDeCreacion(String fechaDeCreacion);

}
