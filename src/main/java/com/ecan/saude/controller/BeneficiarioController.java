package com.ecan.saude.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecan.saude.model.Beneficiario;
import com.ecan.saude.service.BeneficiarioService;

@RestController
@RequestMapping("/api/beneficiarios")
public class BeneficiarioController {
    @Autowired
    private BeneficiarioService beneficiarioService;

    @PostMapping
    public ResponseEntity<Beneficiario> create(@RequestBody Beneficiario beneficiario) {
        Beneficiario savedBeneficiario = beneficiarioService.save(beneficiario);
        return new ResponseEntity<>(savedBeneficiario, HttpStatus.CREATED);
    }

    @GetMapping
    public List<Beneficiario> getAll() {
        return beneficiarioService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Beneficiario> getById(@PathVariable Long id) {
        Optional<Beneficiario> beneficiario = beneficiarioService.findById(id);
        return beneficiario.map(ResponseEntity::ok)
                           .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Beneficiario> update(@PathVariable Long id, @RequestBody Beneficiario beneficiario) {
        if (!beneficiarioService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        beneficiario.setId(id);
        Beneficiario updatedBeneficiario = beneficiarioService.save(beneficiario);
        return ResponseEntity.ok(updatedBeneficiario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (!beneficiarioService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        beneficiarioService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}