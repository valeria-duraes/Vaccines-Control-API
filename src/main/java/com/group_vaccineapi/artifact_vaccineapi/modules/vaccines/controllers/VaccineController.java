package com.group_vaccineapi.artifact_vaccineapi.modules.vaccines.controllers;

import com.group_vaccineapi.artifact_vaccineapi.modules.vaccines.entity.VaccineEntity;
import com.group_vaccineapi.artifact_vaccineapi.modules.vaccines.service.VaccineService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class VaccineController {

    private final VaccineService service;

    public VaccineController(VaccineService service){
        this.service = service;
    }

    @GetMapping("/vaccines")
    public List<VaccineEntity> getAllVaccines(){
        return service.getAllVaccines();
    }

    @GetMapping("/vaccine/{id}")
    public Optional<VaccineEntity> getVaccineById(@PathVariable Integer id){
        return service.getVaccineById(id);
    }

    @PostMapping("/vaccine/create")
    public VaccineEntity createVaccine(@RequestBody @Valid VaccineEntity entity){
        VaccineEntity newVaccine = service.createVaccine(entity);
        return newVaccine;
    }

    @DeleteMapping("/vaccine/{id}")
    public void deleteVaccine(@PathVariable Integer id){
        service.deleteVaccine(id);
    }

    @PutMapping("/vaccine/edit/{id}")
    public VaccineEntity updateVaccine(@PathVariable Integer id,@RequestBody VaccineEntity updatedVaccine) {
        return service.updateVaccine(updatedVaccine, id);
    }

}
