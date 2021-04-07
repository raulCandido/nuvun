package br.com.nuvun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.nuvun.model.Pedido;
import br.com.nuvun.model.dto.PedidoDto;
import br.com.nuvun.repository.PedidoRepository;

@Controller
@RequestMapping("pedido")
public class PedidosController {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	
	@GetMapping("formulario")
	public String abrirFormulario() {
		return "pedido/formulario";
	}
	
	@PostMapping("novo")
	public String cadastrarPedido(PedidoDto pedidoDto) {
		Pedido pedido = pedidoDto.converterPedidoDtoEmPedido();
		pedidoRepository.save(pedido);
		return "pedido/formulario";
	}
	
}
