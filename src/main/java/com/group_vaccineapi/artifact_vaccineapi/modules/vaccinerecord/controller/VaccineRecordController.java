package com.group_vaccineapi.artifact_vaccineapi.modules.vaccinerecord.controller;

import com.group_vaccineapi.artifact_vaccineapi.modules.vaccinerecord.entity.VaccineRecord;
import com.group_vaccineapi.artifact_vaccineapi.modules.vaccinerecord.service.VaccineRecordService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class VaccineRecordController {
    private VaccineRecordService service;

    public VaccineRecordController(VaccineRecordService vaccineRecordService) {
        this.service = vaccineRecordService;
    }

    @PostMapping("/vaccinesrecord/create")
    public VaccineRecord createVaccineRecord(@RequestBody VaccineRecord entity){
        return service.createVaccineRecord(entity);
    }

    @GetMapping("/vaccinesrecord")
    public List<VaccineRecord> getAllVaccineRecord(){
        return service.getAllVaccineRecords();
    }

    @GetMapping("/vaccinesrecord/{id}")
    public Optional<VaccineRecord> getVaccineRecordById(@PathVariable Integer id){

        if(id != null){
            return service.getVaccineRecordById(id);
        }else {
            return Optional.empty();
        }
    }

    @PutMapping("/vaccinesrecord/edit/{id}")
    public ResponseEntity<VaccineRecord> updateVaccineRecord(@PathVariable Integer id, @RequestBody VaccineRecord entity){
        service.updateVaccineRecordById(id, entity);

        if (entity != null){
            return ResponseEntity.ok().build();
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/vaccinesrecord/delete/{id}")
    public void deleteVaccineRecord(@PathVariable Integer id){
        service.deleteVaccineRecordById(id);
    }
}
