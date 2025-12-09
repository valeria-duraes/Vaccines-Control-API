package com.group_vaccineapi.artifact_vaccineapi.modules.vaccinerecord.repository;

import com.group_vaccineapi.artifact_vaccineapi.modules.vaccinerecord.entity.VaccineRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VaccineRecordRepository extends JpaRepository<VaccineRecord,Integer> {

}
