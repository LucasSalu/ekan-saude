package com.ecan.saude.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecan.saude.model.Documento;
import com.ecan.saude.repository.DocumentoRepository;
import com.ecan.saude.service.DocumentoService;

@Service
public class DocumentoServiceImpl implements DocumentoService {
	
    @Autowired
    private DocumentoRepository documentoRepository;

    public List<Documento> findByBeneficiarioId(Long beneficiarioId) {
        return documentoRepository.findByBeneficiarioId(beneficiarioId);
    }

	@Override
	public Documento save(Documento documento) {
		Documento documento_salvo = documentoRepository.save(documento);
		return documento_salvo;
	}

}
