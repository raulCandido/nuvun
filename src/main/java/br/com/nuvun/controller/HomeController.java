package br.com.nuvun.controller;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.nuvun.model.Pedido;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		
		List<Pedido> pedidos = criarPedidos();
		model.addAttribute("pedidos", pedidos);		
		return "home";
	}

	private List<Pedido> criarPedidos() {
		Pedido pedido = new Pedido();

		pedido.setNomeProduto("Novo Echo Dot (4ª Geração): Smart Speaker com Alexa");
		pedido.setUrlImagem("https://images-na.ssl-images-amazon.com/images/I/714Rq4k05UL._AC_SL1000_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/Novo-Echo-Dot-4%C2%AA-gera%C3%A7%C3%A3o/dp/B084DWCZY6/ref=sr_1_1?__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&dchild=1&keywords=echo&qid=1616851080&sr=8-1");
		pedido.setDescricao("Conheça o novo Echo Dot: nosso smart speaker com Alexa de maior sucesso ainda melhor. O novo design de áudio com direcionamento frontal (1 speaker de 1,6\") garante mais graves e um som completo");
		pedido.setDataEntrega(LocalDate.now());
		pedido.setValor(new BigDecimal(154));
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		return pedidos;
	}
}
