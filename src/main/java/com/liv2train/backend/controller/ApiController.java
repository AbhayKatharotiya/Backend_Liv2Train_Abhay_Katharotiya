package com.liv2train.backend.controller;

import com.liv2train.backend.entity.TrainingCenter;
import com.liv2train.backend.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private ApiService apiService;

    @PostMapping("/center")
    public ResponseEntity<TrainingCenter> createCenter(@RequestBody @Valid TrainingCenter trainingCenter){
        return ResponseEntity.ok(apiService.createCenter(trainingCenter));
    }

    @GetMapping("/center")
    public ResponseEntity<List<TrainingCenter>> listCenter(){
        return ResponseEntity.ok(apiService.listCenter());
    }

}
