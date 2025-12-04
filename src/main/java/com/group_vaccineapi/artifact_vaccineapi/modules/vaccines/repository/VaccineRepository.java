package com.group_vaccineapi.artifact_vaccineapi.modules.vaccines.repository;

import com.group_vaccineapi.artifact_vaccineapi.modules.vaccines.entity.VaccineEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VaccineRepository extends JpaRepository<VaccineEntity, Integer> {

}
