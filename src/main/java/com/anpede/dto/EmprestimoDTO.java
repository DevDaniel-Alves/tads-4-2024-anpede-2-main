package com.anpede.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.anpede.entities.Emprestimo;
import com.anpede.entities.Equipamento;
import com.anpede.entities.EquipamentoItem;

public class EmprestimoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private LocalDate dataRetirada;
	private LocalDate dataDevolucao;
	private Equipamento equipamento;
	private String motivo;
	
	public EmprestimoDTO() {
		
	}

	public EmprestimoDTO(Long id,LocalDate dataRetirada, LocalDate dataDevolucao, Equipamento equipamento, String motivo) {
		this.id = id;
		this.dataRetirada = dataRetirada;
		this.dataDevolucao = dataDevolucao;
		this.equipamento = equipamento;
		this.motivo = motivo;
	}
	
	public EmprestimoDTO(Emprestimo entity) {
		this.id = entity.getId();
		this.dataRetirada = entity.getDataRetidada();
		this.dataDevolucao = entity.getDataDevolucao();
		this.equipamento = entity.getEquipamento();
		this.motivo = entity.getMotivo();
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getDataRetirada() {
		return dataRetirada;
	}
	public void setDataRetirada(LocalDate dataRetirada) {
		this.dataRetirada = dataRetirada;
	}
	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	public Equipamento getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}

	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	
	
}
