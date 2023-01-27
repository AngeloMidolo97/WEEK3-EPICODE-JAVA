package it.epicode.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
public abstract class ArticoloDiLettura {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id;
	protected String isbn;
	protected String titolo;
	@Column(name="anno_pubblicazione")
	protected int annoPubblicazione;
	@Column(name="numero_pagine")
	protected int numeroPagine;
	
	public ArticoloDiLettura(String isbn, String titolo, int annoPubblicazione, int numeroPagine) {
		super();
		this.isbn = isbn;
		this.titolo = titolo;
		this.annoPubblicazione = annoPubblicazione;
		this.numeroPagine = numeroPagine;
	}
}
