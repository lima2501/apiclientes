package com.limaprojects.apiclientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.limaprojects.apiclientes.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	Cliente findById(long id);
}
