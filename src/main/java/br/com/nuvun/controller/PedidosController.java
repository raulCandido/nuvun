package br.com.nuvun.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
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
	public String abrirFormulario(@Valid PedidoDto pedidoDto, BindingResult result) {
		return "pedido/formulario";
	}

	@PostMapping("novo")
	public String cadastrarPedido(@Valid PedidoDto pedidoDto, BindingResult result) {
		if (result.hasErrors()) {
			return "pedido/formulario";
		}
		Pedido pedido = pedidoDto.converterPedidoDtoEmPedido();
		pedidoRepository.save(pedido);
		return "pedido/formulario";
	}
	
	@GetMapping("logoff")
	public String sairDoSistema() {
		return "pedido/login";
	}
}
