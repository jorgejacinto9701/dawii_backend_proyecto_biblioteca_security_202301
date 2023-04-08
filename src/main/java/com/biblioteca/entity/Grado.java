package com.biblioteca.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "grado_autor")
public class Grado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idGrado;
	private String descripcion;

}
