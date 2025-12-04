package com.group_vaccineapi.artifact_vaccineapi.modules.patient.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.hibernate.validator.constraints.Length;

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

    @NotBlank(message = "O nome é obrigatório!")
    @Column(name = "name")
    private String name;

    @Email(message = "O e-mail precisa ser válido!")
    @Column(name = "email")
    private String email;

    @NotBlank(message = "O cpf é obrigatório!")
    @Length(min = 11, max = 22)
    @Column(name = "cpf", unique = true, nullable = false)
    private String cpf;

//    @Size(min= 1, max = 150, message = "A idade mínima é de 1 e máxima de 150!")
    @Column(name = "age")
    private Integer age;
}
