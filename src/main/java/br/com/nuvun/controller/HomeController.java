package br.com.nuvun.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.nuvun.model.Pedido;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home() {
		return "home";
	}

	private List<Pedido> criarPedido() {
		Pedido pedido = new Pedido();

		pedido.setNomePedido("Novo Echo Dot (4ª Geração): Smart Speaker com Alexa");

		List<Pedido> pedidos = Arrays.asList(pedido);
		return pedidos;
	}
}
