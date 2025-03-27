package br.com.fiap.checkpoint1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.fiap.checkpoint1.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}