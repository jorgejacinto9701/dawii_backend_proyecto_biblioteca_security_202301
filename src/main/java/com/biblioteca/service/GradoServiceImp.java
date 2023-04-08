package com.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.entity.Grado;
import com.biblioteca.repository.GradoRepository;

@Service
public class GradoServiceImp implements GradoService {

	@Autowired
	private GradoRepository repository;

	@Override
	public List<Grado> listaTodos() {
		return repository.findAll();

	}

}
