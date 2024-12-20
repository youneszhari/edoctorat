package com.example.edoctorat.services;

import com.example.edoctorat.models.CandidatModel;
import com.example.edoctorat.repositories.CandidatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidatService {

    @Autowired
    private CandidatRepository candidatRepository;

    public CandidatModel saveCandidat(CandidatModel candidat) {
        return candidatRepository.save(candidat);
    }

    public CandidatModel getCandidatById(long id) {
        return candidatRepository.findById(id).orElse(null);
    }

}