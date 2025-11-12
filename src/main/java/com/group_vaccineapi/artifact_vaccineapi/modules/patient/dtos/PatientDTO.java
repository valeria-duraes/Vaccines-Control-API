package com.group_vaccineapi.artifact_vaccineapi.modules.patient.dtos;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PatientDTO {
    @NotBlank(message = "O nome é obrigatório!")
    private String name;

    @Email(message = "O e-mail precisa ser válido!")
    private String email;

    @NotBlank(message = "O cpf é obrigatório!")
    private String cpf;

    private Integer age;
}
