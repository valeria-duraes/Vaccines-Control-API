package com.group_vaccineapi.artifact_vaccineapi.modules.patient.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "patient")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PatientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Length(min = 11, max = 22)
    @Column(name = "cpf", unique = true, nullable = false)
    private String cpf;

    @Column(name = "age")
    private Integer age;
}
