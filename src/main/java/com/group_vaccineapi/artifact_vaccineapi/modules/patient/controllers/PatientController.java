package com.group_vaccineapi.artifact_vaccineapi.modules.patient.controllers;

import com.group_vaccineapi.artifact_vaccineapi.modules.patient.dtos.PatientDTO;
import com.group_vaccineapi.artifact_vaccineapi.modules.patient.entities.PatientEntity;
import com.group_vaccineapi.artifact_vaccineapi.modules.patient.services.PatientService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api") // 🔹 endpoint base: /patients
public class PatientController {
    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping("/patients")
    public ResponseEntity<PatientEntity> createPatient(@Valid @RequestBody PatientEntity patient) {
        PatientEntity newPatient = patientService.createPatient(patient);
        return ResponseEntity.status(HttpStatus.CREATED).body(newPatient);
    }

    @GetMapping("/patients")
    public ResponseEntity<List<PatientEntity>> getAllPatients(){
        List<PatientEntity> patients = patientService.getAllPatients();
        return ResponseEntity.ok(patients);
    }
}
