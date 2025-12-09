package com.group_vaccineapi.artifact_vaccineapi.modules.vaccinerecord.entity;

import com.group_vaccineapi.artifact_vaccineapi.modules.patient.entities.PatientEntity;
import com.group_vaccineapi.artifact_vaccineapi.modules.vaccines.entity.VaccineEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "vaccinerecord")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VaccineRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_patient")
    private PatientEntity patient;

    @ManyToOne
    @JoinColumn(name = "id_vaccine")
    private VaccineEntity vaccine;

    private LocalDate date;
}
