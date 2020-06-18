package com.liv2train.backend.service;

import com.liv2train.backend.entity.TrainingCenter;
import com.liv2train.backend.repository.TrainingCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ApiService {

    @Autowired
    private TrainingCenterRepository trainingCenterRepository;

    public TrainingCenter createCenter(TrainingCenter trainingCenter) {
        trainingCenter.setCreatedOn(new Date());
        return trainingCenterRepository.save(trainingCenter);
    }

    public List<TrainingCenter> listCenter() {
        return trainingCenterRepository.findAll();
    }
}
