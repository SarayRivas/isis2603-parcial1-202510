package co.edu.uniandes.dse.parcialprueba.entities;
import lombok.Data;
import uk.co.jemos.podam.common.PodamExclude;
import jakarta.persistence.Entity;

@Data
@Entity
public class PacienteEntity extends BaseEntity {

    private String nombre;
    private String correo;

    @PodamExclude
    private Integer numero;

    @PodamExclude
    private Long id;


    @OneToMany(mappedBy = "paciente",fetch = FetchType.LAZY)
    private<HistoriaClinicaEntity> historiaClinica;
    
    @OneToOne(mappedBy = "acudiente",fetch = Fetch.Type.LAZY)



}
