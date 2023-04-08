package com.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.entity.Categoria;
import com.biblioteca.repository.CategoriaRepository;

@Service
public class CategoriaServiceImp implements CategoriaService {

	@Autowired
	private CategoriaRepository repository;

	@Override
	public List<Categoria> listaTodos() {
		return repository.findAll();

	}

}
