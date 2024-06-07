package com.ecan.saude.service;

import java.util.List;
import java.util.Optional;

import com.ecan.saude.model.Beneficiario;

public interface BeneficiarioService {
	
    public Beneficiario save(Beneficiario beneficiario);
    
    public List<Beneficiario> findAll();

    public Optional<Beneficiario> findById(Long id);
    
    public void deleteById(Long id);

}
