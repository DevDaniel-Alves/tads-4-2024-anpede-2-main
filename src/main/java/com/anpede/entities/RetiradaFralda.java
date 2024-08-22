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
@Table(name = "tb_retiradafralda")
public class RetiradaFralda implements Serializable{
	
	private static final long SerialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private Integer quantidade;
	private LocalDate dataRetida;
	
	public RetiradaFralda() {
		
	}
	public RetiradaFralda(long id, Integer quantidade, LocalDate dataRetida) {
		super();
		this.id = id;
		this.quantidade = quantidade;
		this.dataRetida = dataRetida;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public LocalDate getDataRetida() {
		return dataRetida;
	}
	public void setDataRetida(LocalDate dataRetida) {
		this.dataRetida = dataRetida;
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
		RetiradaFralda other = (RetiradaFralda) obj;
		return id == other.id;
	}
	
}
