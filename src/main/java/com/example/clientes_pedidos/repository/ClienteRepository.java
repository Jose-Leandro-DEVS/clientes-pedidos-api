package com.example.clientes_pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.clientes_pedidos.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
