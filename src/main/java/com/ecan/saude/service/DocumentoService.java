package com.ecan.saude.service;

import java.util.List;

import com.ecan.saude.model.Documento;

public interface DocumentoService {
	
    public List<Documento> findByBeneficiarioId(Long beneficiarioId);
    
    public Documento save(Documento documento);

}
