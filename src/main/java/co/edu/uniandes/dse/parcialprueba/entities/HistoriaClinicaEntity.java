package co.edu.uniandes.dse.parcialprueba.entities;
import lombok.Data;
import uk.co.jemos.podam.common.PodamExclude;
import jakarta.persistence.Entity;

@Data
@Entity
public class HistoriaClinicaEntity extends BaseEntity{
    private String diagnostico;
    private String tratamiento;
    private String fechaDeCreacion;

    @PodamExclude
    private Long id;

    @OneToOne(mappedBy = "historiaClinica",fetch = FetchType.LAZY);
    private<PacienteEntity> paciente;

}
