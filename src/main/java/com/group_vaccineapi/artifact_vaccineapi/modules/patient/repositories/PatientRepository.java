package com.group_vaccineapi.artifact_vaccineapi.modules.patient.repositories;

import com.group_vaccineapi.artifact_vaccineapi.modules.patient.dtos.PatientDTO;
import com.group_vaccineapi.artifact_vaccineapi.modules.patient.entities.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<PatientEntity, Integer> {
}
