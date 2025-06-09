package com.example.clientes_pedidos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.clientes_pedidos.model.Cliente;
//import com.example.clientes_pedidos.model.Pedido;
import com.example.clientes_pedidos.repository.ClienteRepository;
import com.example.clientes_pedidos.repository.PedidoRepository;

import jakarta.transaction.Transactional;

@Service
public class ClientePedidoService {

	    @Autowired
	    private ClienteRepository clienteRepository;
	    
	    @SuppressWarnings("unused")
		@Autowired
	    private PedidoRepository pedidoRepository;

	@Transactional
	public Cliente salvarClienteComPedidos(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public Cliente buscarClienteComPedidos(Long id) {
		return clienteRepository.findById(id).orElse(null);
	}
	
}
