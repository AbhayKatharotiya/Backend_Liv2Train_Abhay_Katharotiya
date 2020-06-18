package com.liv2train.backend.repository;

import com.liv2train.backend.entity.TrainingCenter;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingCenterRepository  extends MongoRepository<TrainingCenter,String> {
}
