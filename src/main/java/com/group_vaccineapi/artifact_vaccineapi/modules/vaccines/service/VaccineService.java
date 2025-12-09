package com.group_vaccineapi.artifact_vaccineapi.modules.vaccines.service;

import com.group_vaccineapi.artifact_vaccineapi.modules.vaccines.entity.VaccineEntity;
import com.group_vaccineapi.artifact_vaccineapi.modules.vaccines.repository.VaccineRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VaccineService {
    private final VaccineRepository vaccineRepository;

    public VaccineService(VaccineRepository vaccineRepository) {
        this.vaccineRepository = vaccineRepository;
    }

    // Metodo que retorna uma lista (List<>) com todas as vacinas
    public List<VaccineEntity> getAllVaccines(){
        return vaccineRepository.findAll();
    }

    // Metodo que busca vacine por id, retornando um Optional<>
    public Optional<VaccineEntity> getVaccineById(Integer id){
        if(id == null){
            return Optional.empty();
        } else {
            return vaccineRepository.findById(id);
        }
    }

    // Metodo que cadastra uma vacina
    public VaccineEntity createVaccine(VaccineEntity vaccine){
        return vaccineRepository.save(vaccine);
    }

    // Metodo para deletar uma vacina - só passo void pois não vamos retornar nada - não precisa passar a VaccineEntity
    public boolean deleteVaccine(Integer vaccineId){
        if(vaccineRepository.findById(vaccineId).isPresent()){
            vaccineRepository.deleteById(vaccineId);
            return true;
        }else {
            return false;
        }
    }

    // Metodo para alterar os dados de uma vacina cadastrada
    public VaccineEntity updateVaccine(VaccineEntity vaccine, Integer id){
        // Busca a vacina por id
        VaccineEntity existingVaccine = vaccineRepository.findById(id).orElse(null);

        if(existingVaccine == null){
            return null;
        }

        // Atualiza apenas os campos recebidos
        VaccineEntity updatedVaccine = VaccineEntity.builder()
                .id(existingVaccine.getId())
                .name(vaccine.getName() != null ? vaccine.getName() : existingVaccine.getName())
                .manufacturer(vaccine.getManufacturer() != null ? vaccine.getManufacturer() : existingVaccine.getManufacturer())
                .doses(vaccine.getDoses() != null ? vaccine.getDoses() : existingVaccine.getDoses())
                .intervalDays(vaccine.getIntervalDays() != null ? vaccine.getIntervalDays() : existingVaccine.getIntervalDays())
                .build();

        // salva no banco
        return vaccineRepository.save(updatedVaccine);
    }
}
