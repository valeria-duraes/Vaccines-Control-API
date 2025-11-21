package com.group_vaccineapi.artifact_vaccineapi.modules.patient.services;

import com.group_vaccineapi.artifact_vaccineapi.modules.patient.entities.PatientEntity;
import com.group_vaccineapi.artifact_vaccineapi.modules.patient.repositories.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PatientService {
    private final PatientRepository patientRepository;

    public PatientService (PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    // Criar
    public PatientEntity createPatient(PatientEntity patient){
        return patientRepository.save(patient);
    }

    // Listar todos
    public List<PatientEntity> getAllPatients(){
        return patientRepository.findAll();
    }

    // Buscar por ID
    public PatientEntity getPatientById(Integer id){
        Optional<PatientEntity> patient = patientRepository.findById(id);

        if(patient.isPresent()){
            return patient.get();
        }
        return null;
    }

    // Buscar por cpf
    public Optional<PatientEntity> getPatientByCpf(String cpf){
        Optional<PatientEntity> patient = patientRepository.findByCpf(cpf);

        if(patient != null){
            return patient;
        }

        return null;
    }
}
