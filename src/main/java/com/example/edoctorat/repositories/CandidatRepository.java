package com.example.edoctorat.repositories;

import com.example.edoctorat.models.CandidatModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CandidatRepository extends JpaRepository<CandidatModel, Long> {
}
