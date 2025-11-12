package com.group_vaccineapi.artifact_vaccineapi.modules.patient.controllers;

import com.group_vaccineapi.artifact_vaccineapi.modules.patient.dtos.PatientDTO;
import com.group_vaccineapi.artifact_vaccineapi.modules.patient.services.PatientService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") // 🔹 endpoint base: /patients
public class PatientController {
    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping("/patients")
    public ResponseEntity<PatientDTO> createPatient(@Valid @RequestBody PatientDTO patientDTO) {
        PatientDTO newPatient = patientService.createPatient(patientDTO);
        return ResponseEntity.ok(newPatient);
    }
}
