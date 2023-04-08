package com.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.entity.Alumno;
import com.biblioteca.entity.Categoria;
import com.biblioteca.entity.Grado;
import com.biblioteca.entity.Modalidad;
import com.biblioteca.entity.Pais;
import com.biblioteca.entity.Sede;
import com.biblioteca.service.AlumnoService;
import com.biblioteca.service.CategoriaService;
import com.biblioteca.service.GradoService;
import com.biblioteca.service.ModalidadService;
import com.biblioteca.service.PaisService;
import com.biblioteca.service.SedeService;
import com.biblioteca.util.AppSettings;

@RestController
@RequestMapping("/url/util")
@CrossOrigin(origins = AppSettings.URL_CROSS_ORIGIN)
public class UtilController {

	@Autowired
	private PaisService paisService;

	@Autowired
	private GradoService gradoService;

	@Autowired
	private CategoriaService categoriaService;
	
	@Autowired
	private AlumnoService alumnoService;
	
	@Autowired
	private ModalidadService modalidadService;
	
	@Autowired
	private SedeService sedeService;
	
	@GetMapping("/listaPais")
	@ResponseBody
	public List<Pais> listaPais() {
		return paisService.listaTodos();
	}

	@GetMapping("/listaCategoria")
	@ResponseBody
	public List<Categoria> listaCategoria() {
		return categoriaService.listaTodos();
	}
	
	@GetMapping("/listaGrado")
	@ResponseBody
	public List<Grado> listaGrado() {
		return gradoService.listaTodos();
	}

	@GetMapping("/listaModalidad")
	@ResponseBody
	public List<Modalidad> listaModalidad() {
		return modalidadService.listaTodos();
				
	}
	
	@GetMapping("/listaSede")
	@ResponseBody
	public List<Sede> listaSede() {
		return sedeService.listaTodos();
				
	}
	
	@GetMapping("/listaAlumno")
	@ResponseBody
	public List<Alumno> listaAlumno() {
		return alumnoService.listaTodos();
				
		
		
	}
}
