package com.ecan.saude.service.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecan.saude.model.Beneficiario;
import com.ecan.saude.repository.BeneficiarioRepository;
import com.ecan.saude.service.BeneficiarioService;

@Service
public class BeneficiarioServiceImpl implements BeneficiarioService {
	
    @Autowired
    private BeneficiarioRepository beneficiarioRepository;

    public Beneficiario save(Beneficiario beneficiario) {
        return beneficiarioRepository.save(beneficiario);
    }

    public List<Beneficiario> findAll() {
        return beneficiarioRepository.findAll();
    }

    public Optional<Beneficiario> findById(Long id) {
        return beneficiarioRepository.findById(id);
    }

    public void deleteById(Long id) {
        beneficiarioRepository.deleteById(id);
    }
}
