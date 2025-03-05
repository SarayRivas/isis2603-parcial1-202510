package co.edu.uniandes.dse.parcialprueba.services;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import co.edu.uniandes.dse.parcialprueba.repositories.PacienteRepository;
import co.edu.uniandes.dse.parcialprueba.entities.PacienteEntity;
import co.edu.uniandes.dse.parcialprueba.exceptions.IllegalOperationException;
import co.edu.uniandes.dse.parcialprueba.repositories.HistoriaClinicaRepository;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;
    @Autowired
    private HistoriaClinicaRepository historiaClinicaRepository;

    @Transactional
    public PacienteEntity pacienteNuevo(PacienteEntity paciente) throws EntityNotFoundException, IllegalOperationException{
        log.info("Creando un nuevo paciente");
     
        if(pacienteEntity.getNumero().size()<11 || pacienteEntity.getNumero().size()>11){
            throw new IllegalOperationException("El número de teléfono debe tener 11 dígitos");
        
        if(!pacienteEntity.getNumero().contains("311")|| pacienteEntity.getNumero().contains("601")){
            throw new IllegalOperationException("El número de teléfono debe empezar por 311 o 601");}
        
        PacienteEntity.pacienteEntity = pacienteRepository.save(paciente);}
        return pacienteEntity;
        }
       

    public PacienteEntity asociarAcudiente(PacienteEntity acudiente) throws EntityNotFoundException, IllegalOperationException{


}
