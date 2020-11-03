package com.limaprojects.apiclientes.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.limaprojects.apiclientes.domain.Cliente;
import com.limaprojects.apiclientes.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteResource {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@PostMapping
	public Cliente createCliente(Cliente cliente) {
		clienteRepository.save(cliente);
		return cliente;
	}
	
	@GetMapping
	public List<Cliente> readAllClientes(){
		return clienteRepository.findAll();
	}
	
	@GetMapping("/cliente")
	public Cliente readOneCliente(long id) {
		return clienteRepository.findById(id);
	}
	
	@PutMapping
	public Cliente updateCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	@DeleteMapping
	public void deleteCliente(long id) {
		clienteRepository.deleteById(id);
	}
	
}
