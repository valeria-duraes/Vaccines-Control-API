package com.group_vaccineapi.artifact_vaccineapi.modules.patient.services;

import com.group_vaccineapi.artifact_vaccineapi.modules.patient.dtos.PatientDTO;
import com.group_vaccineapi.artifact_vaccineapi.modules.patient.entities.PatientEntity;
import com.group_vaccineapi.artifact_vaccineapi.modules.patient.repositories.PatientRepository;
import org.springframework.stereotype.Service;


@Service
public class PatientService {
    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

// Criar PatientService com métodos findAll, save, delete e injetar repository via construtor

    // 1️⃣ Criar novo paciente
    public PatientDTO createPatient(PatientDTO dto) {
        // Converter DTO → Entity
        PatientEntity entity = new PatientEntity();
                entity.setName(dto.getName());
                entity.setEmail(dto.getEmail());
                entity.setCpf(dto.getCpf());
                entity.setAge(dto.getAge());

        // Salvar no banco
        patientRepository.save(entity);

        // Converter Entity -> DTO (para retornar o que foi salvo)
        return dto;
    }

    // 2️⃣ Buscar todos os pacientes


    // 3️⃣ Buscar paciente por CPF


    // 4️⃣ Atualizar paciente


    // 5️⃣ Deletar paciente


    // 🔄 Métodos auxiliares para conversão
//    private PatientDTO convertToDTO(PatientEntity entity) {
//        return PatientDTO.builder()
//                .name(entity.getName())
//                .email(entity.getEmail())
//                .cpf(entity.getCpf())
//                .age(entity.getAge())
//                .build();
//    }

}
