package com.ecan.saude.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecan.saude.model.Beneficiario;
@Repository
public interface BeneficiarioRepository extends JpaRepository<Beneficiario, Long> {
}
