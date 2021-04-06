package br.com.nuvun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PedidosController {
	
	@GetMapping("/pedido/formulario")
	public String clickNovoPedido() {
		
		System.out.println("passou nesse metodo");
		return "/pedido/formulario";
	}
}
