package com.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.entity.Modalidad;
import com.biblioteca.repository.ModalidadRepository;

@Service
public class ModalidadServiceImp implements ModalidadService {

	@Autowired
	private ModalidadRepository repository;

	@Override
	public List<Modalidad> listaTodos() {
		return repository.findAll();

	}

}
