package com.ecan.saude.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Documento {
	   	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String tipoDocumento;
	    private String descricao;
	    private LocalDateTime dataInclusao;
	    private LocalDateTime dataAtualizacao;
	    

	    public Documento(Long id, String tipoDocumento, String descricao, LocalDateTime dataInclusao,
				LocalDateTime dataAtualizacao, Beneficiario beneficiario) {
			super();
			this.id = id;
			this.tipoDocumento = tipoDocumento;
			this.descricao = descricao;
			this.dataInclusao = dataInclusao;
			this.dataAtualizacao = dataAtualizacao;
			this.beneficiario = beneficiario;
		}
	    
	    

		public Documento(String tipoDocumento, String descricao, LocalDateTime dataInclusao,
				LocalDateTime dataAtualizacao, Beneficiario beneficiario) {
			super();
			this.tipoDocumento = tipoDocumento;
			this.descricao = descricao;
			this.dataInclusao = dataInclusao;
			this.dataAtualizacao = dataAtualizacao;
			this.beneficiario = beneficiario;
		}

		public Documento() {
		}




		@ManyToOne
		@JsonBackReference
	    @JoinColumn(name = "beneficiario_id", nullable = false)
	    private Beneficiario beneficiario;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTipoDocumento() {
			return tipoDocumento;
		}

		public void setTipoDocumento(String tipoDocumento) {
			this.tipoDocumento = tipoDocumento;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public LocalDateTime getDataInclusao() {
			return dataInclusao;
		}

		public void setDataInclusao(LocalDateTime dataInclusao) {
			this.dataInclusao = dataInclusao;
		}

		public LocalDateTime getDataAtualizacao() {
			return dataAtualizacao;
		}

		public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
			this.dataAtualizacao = dataAtualizacao;
		}

		public Beneficiario getBeneficiario() {
			return beneficiario;
		}

		public void setBeneficiario(Beneficiario beneficiario) {
			this.beneficiario = beneficiario;
		}

	    

}
