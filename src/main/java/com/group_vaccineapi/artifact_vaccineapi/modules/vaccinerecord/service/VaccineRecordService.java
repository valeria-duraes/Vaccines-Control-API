package com.group_vaccineapi.artifact_vaccineapi.modules.vaccinerecord.service;

import com.group_vaccineapi.artifact_vaccineapi.modules.vaccinerecord.entity.VaccineRecord;
import com.group_vaccineapi.artifact_vaccineapi.modules.vaccinerecord.repository.VaccineRecordRepository;
import com.group_vaccineapi.artifact_vaccineapi.modules.vaccines.entity.VaccineEntity;
import com.group_vaccineapi.artifact_vaccineapi.modules.vaccines.repository.VaccineRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VaccineRecordService {
    private VaccineRecordRepository repository;

    public VaccineRecordService(VaccineRecordRepository vaccineRepository) {
        this.repository = vaccineRepository;
    }

    public List<VaccineRecord> getAllVaccineRecords() {
        return repository.findAll();
    }

    public Optional<VaccineRecord> getVaccineRecordById(Integer id) {
        return repository.findById(id);
    }

    public VaccineRecord createVaccineRecord(VaccineRecord vaccineRecord){
        return repository.save(vaccineRecord);
    }

    public VaccineRecord updateVaccineRecordById(Integer id, VaccineRecord bodyVaccineRecord) {
        VaccineRecord existentVaccineRecord = repository.findById(id).orElseThrow(
                () -> new RuntimeException("Vaccine record with id " + id + " not found"));

        VaccineRecord updatedVaccineRecord = VaccineRecord.builder()
                .id(existentVaccineRecord.getId())
                .patient(bodyVaccineRecord.getPatient() != null ? bodyVaccineRecord.getPatient() : existentVaccineRecord.getPatient())
                .vaccine(bodyVaccineRecord.getVaccine() != null ? bodyVaccineRecord.getVaccine() : existentVaccineRecord.getVaccine())
                .date(bodyVaccineRecord.getDate() != null ? bodyVaccineRecord.getDate() : existentVaccineRecord.getDate())
                .build();

        return repository.save(updatedVaccineRecord);
    }

    public void deleteVaccineRecordById(Integer id) {
        repository.deleteById(id);
    }
}
