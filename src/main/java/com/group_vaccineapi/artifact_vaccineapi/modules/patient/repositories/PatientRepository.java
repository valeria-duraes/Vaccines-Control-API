package com.group_vaccineapi.artifact_vaccineapi.modules.patient.repositories;

import com.group_vaccineapi.artifact_vaccineapi.modules.patient.dtos.PatientDTO;
import com.group_vaccineapi.artifact_vaccineapi.modules.patient.entities.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<PatientEntity, Integer> {

    Optional<PatientEntity> findByCpf(String cpf);

    // SELECT * FROM patient WHERE cpf = :cpf LIMIT 1
}
