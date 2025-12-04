package com.group_vaccineapi.artifact_vaccineapi.modules.vaccines.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Table(name = "vaccine")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VaccineEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "É obrigatório cadastrar o nome da vacina!")
    @Column(name = "name")
    private String name;

    @NotBlank(message = "É obrigatório cadastrar o nome do fabricante da vacina!")
    @Column(name = "manufacturer")
    private String manufacturer;

    @Column(name = "doses")
    private Integer doses;

    @Column(name = "interval_days")
    private Integer intervalDays;

}

