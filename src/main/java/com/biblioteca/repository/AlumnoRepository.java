package com.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.entity.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Integer>{
	
	

}
