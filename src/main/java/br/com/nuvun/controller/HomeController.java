package br.com.nuvun.controller;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.nuvun.model.Pedido;
import br.com.nuvun.repository.PedidoRepository;

@Controller
public class HomeController {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	

	@GetMapping("/")
	public String home(Model model) {
		List<Pedido> pedidos = buscarPedidos();
		//criarPedido();
		model.addAttribute("pedidos", pedidos);		
		return "home";
	}

	private List<Pedido> buscarPedidos() {		
		List<Pedido> pedidos = pedidoRepository.findAll();
		return pedidos;
	}
	
}
