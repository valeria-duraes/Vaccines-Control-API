package com.group_vaccineapi.artifact_vaccineapi.modules.patient.services;

import com.group_vaccineapi.artifact_vaccineapi.modules.patient.entities.PatientEntity;
import com.group_vaccineapi.artifact_vaccineapi.modules.patient.repositories.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;


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
}
