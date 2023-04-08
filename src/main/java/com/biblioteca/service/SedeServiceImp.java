package com.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.entity.Sede;
import com.biblioteca.repository.SedeRepository;

@Service
public class SedeServiceImp implements SedeService {

	@Autowired
	private SedeRepository repository;

	@Override
	public List<Sede> listaTodos() {
		return repository.findAll();

	}

}
