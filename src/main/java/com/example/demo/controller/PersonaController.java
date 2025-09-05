package com.example.demo.controller;

import com.example.demo.model.Persona;
import com.example.demo.repository.PersonaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {
	
	private final PersonaRepository repository;

	public PersonaController(PersonaRepository repository) {
		this.repository = repository;
	}
	
	  @GetMapping
	    public List<Persona> listar() {
	        return repository.findAll();
	    }

	    @PostMapping
	    public Persona crear(@RequestBody Persona persona) {
	        return repository.save(persona);
	    }

	    @GetMapping("/{id}")
	    public Persona obtener(@PathVariable Long id) {
	        return repository.findById(id).orElseThrow();
	    }

	    @PutMapping("/{id}")
	    public Persona actualizar(@PathVariable Long id, @RequestBody Persona nuevaPersona) {
	        return repository.findById(id).map(persona -> {
	            persona.setNombre(nuevaPersona.getNombre());
	            persona.setEdad(nuevaPersona.getEdad());
	            return repository.save(persona);
	        }).orElseThrow();
	    }

	    @DeleteMapping("/{id}")
	    public void eliminar(@PathVariable Long id) {
	        repository.deleteById(id);
	    }

}
