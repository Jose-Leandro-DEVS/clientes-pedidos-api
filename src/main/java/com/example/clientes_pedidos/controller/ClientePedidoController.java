package com.example.clientes_pedidos.controller;

import org.springframework.web.bind.annotation.*;
import com.example.clientes_pedidos.model.Cliente;
import com.example.clientes_pedidos.service.ClientePedidoService;

@RestController
@RequestMapping("api/clientes")
public class ClientePedidoController {
	
	private final ClientePedidoService service;
	
	public ClientePedidoController(ClientePedidoService service) {
		this.service = service;
	}
	
	@PostMapping
	public Cliente criarClienteComPedidos(@RequestBody Cliente cliente) {
		return service.salvarClienteComPedidos(cliente);
	}
	
	@GetMapping("/{id}")
	public Cliente buscarCliente(@PathVariable Long id) {
		return service.buscarClienteComPedidos(id);
	}
}
