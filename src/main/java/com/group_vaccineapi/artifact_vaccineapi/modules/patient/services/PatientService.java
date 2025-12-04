package com.group_vaccineapi.artifact_vaccineapi.modules.patient.services;

import com.group_vaccineapi.artifact_vaccineapi.modules.patient.entities.PatientEntity;
import com.group_vaccineapi.artifact_vaccineapi.modules.patient.repositories.PatientRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

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

    // Listar todos, retorna uma (List<>)
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

    // Alterar dados do paciente
    public PatientEntity updatePatientById(Integer id, PatientEntity newData){
        // 1- Buscar o paciente pelo Id
        PatientEntity existingPatient = patientRepository.findById(id).orElse(null);

        if(existingPatient == null){
            return null; // Controller vai retornar 404
        }

        // 2- Atualizar apenas os campos recebidos
        existingPatient.setName(newData.getName());
        existingPatient.setEmail(newData.getEmail());
        existingPatient.setCpf(newData.getCpf());
        existingPatient.setAge(newData.getAge());

        // 3- Salvar no banco
        return patientRepository.save(existingPatient);
    }

    // Deletar
    public void deletePatientById(Integer id){
        patientRepository.deleteById(id);
    }



}
