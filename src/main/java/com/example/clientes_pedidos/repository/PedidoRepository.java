package com.example.clientes_pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.clientes_pedidos.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
