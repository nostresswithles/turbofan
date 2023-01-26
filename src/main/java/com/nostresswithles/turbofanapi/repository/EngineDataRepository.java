package com.nostresswithles.turbofanapi.repository;

import com.nostresswithles.turbofanapi.models.EngineData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface EngineDataRepository extends JpaRepository<EngineData, Long> {

}