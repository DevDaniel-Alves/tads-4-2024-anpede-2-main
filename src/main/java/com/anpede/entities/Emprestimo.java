package com.anpede.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_emprestimo")
public class Emprestimo implements Serializable{
	private static final long SerialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private LocalDate dataRetidada;
	private LocalDate dataDevolucao;
	private Equipamento Equipamento;
	private String motivo;
	
	
	public Emprestimo() {
		
	}
	public Emprestimo(long id, LocalDate dataRetidada, LocalDate dataDevolucao,
			com.anpede.entities.Equipamento equipamento, String motivo) {
		super();
		this.id = id;
		this.dataRetidada = dataRetidada;
		this.dataDevolucao = dataDevolucao;
		Equipamento = equipamento;
		this.motivo = motivo;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public LocalDate getDataRetidada() {
		return dataRetidada;
	}
	public void setDataRetidada(LocalDate dataRetidada) {
		this.dataRetidada = dataRetidada;
	}
	
	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	
	public Equipamento getEquipamento() {
		return Equipamento;
	}
	public void setEquipamento(Equipamento equipamento) {
		Equipamento = equipamento;
	}
	
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emprestimo other = (Emprestimo) obj;
		return id == other.id;
	}

}
