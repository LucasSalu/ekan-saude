package com.ecan.saude.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecan.saude.model.Beneficiario;
import com.ecan.saude.model.Documento;
import com.ecan.saude.service.BeneficiarioService;
import com.ecan.saude.service.DocumentoService;

@RestController
@RequestMapping("/api/documentos")
public class DocumentoController {
	
    @Autowired
    private DocumentoService documentoService;

    @Autowired
    private BeneficiarioService beneficiarioService;

    @GetMapping("/beneficiario/{beneficiarioId}")
    public List<Documento> getByBeneficiarioId(@PathVariable Long beneficiarioId) {	
    	Beneficiario beneficiario1 =  new Beneficiario("TEste1", "19993520001", LocalDate.now(), LocalDateTime.now(), LocalDateTime.now());
    	Documento documento1 = new Documento("RG", "523524dfg",LocalDateTime.now(), LocalDateTime.now(), beneficiario1);
    	Documento documento2 = new Documento("RG", "523524dfg",LocalDateTime.now(), LocalDateTime.now(), beneficiario1);
    	beneficiario1.addDocumentos(documento2);
    	beneficiario1.addDocumentos(documento1);
    	beneficiarioService.save(beneficiario1);
    	
        return documentoService.findByBeneficiarioId(beneficiarioId);
    }
}