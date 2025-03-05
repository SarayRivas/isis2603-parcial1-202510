package co.edu.uniandes.dse.parcialprueba.services;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import co.edu.uniandes.dse.parcialprueba.repositories.HistoriaClinicaRepository;
import co.edu.uniandes.dse.parcialprueba.entities.HistoriaClinicaEntity;
import co.edu.uniandes.dse.parcialprueba.exceptions.IllegalOperationException;
import co.edu.uniandes.dse.parcialprueba.repositories.PacienteRepository;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
public class HistoriaClinicaService {
    @Autowired
    private HistoriaClinicaRepository historiaClinicaRepository;
    @Autowired
    private PacienteRepository pacienteRepository:

    @Transactional
    public HistoriaClinicaEntity crearHistoriaClinica(HistoriaClinicaEntity historiaClinica)

}
