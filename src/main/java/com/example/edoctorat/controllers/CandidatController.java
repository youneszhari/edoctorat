package com.example.edoctorat.controllers;

import com.example.edoctorat.models.CandidatModel;
import com.example.edoctorat.services.CandidatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/candidats/")
public class CandidatController {

    @Autowired
    private CandidatService candidatService;

    @PostMapping
    public CandidatModel createCandidat(@RequestBody CandidatModel candidat) {
        return candidatService.saveCandidat(candidat);
    }

    @GetMapping("/{id}")
    public CandidatModel getCandidat(@PathVariable long id) {
        return candidatService.getCandidatById(id);
    }
}
