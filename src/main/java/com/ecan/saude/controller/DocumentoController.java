package com.ecan.saude.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecan.saude.model.Documento;
import com.ecan.saude.service.BeneficiarioService;
import com.ecan.saude.service.DocumentoService;

@RestController
@RequestMapping("/api/documentos")
public class DocumentoController {
	
    @Autowired
    private DocumentoService documentoService;

    @GetMapping("/beneficiario/{beneficiarioId}")
    public List<Documento> getByBeneficiarioId(@PathVariable Long beneficiarioId) {	
        return documentoService.findByBeneficiarioId(beneficiarioId);
    }
}