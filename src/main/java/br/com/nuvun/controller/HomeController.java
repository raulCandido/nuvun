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
	

	@GetMapping("/home")
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
	
	private void criarPedido() {	
		Pedido pedido = new Pedido();
		pedido.setDataEntrega(LocalDate.now());
		pedido.setDescricao("Caneca estilizada do mundo de Alice");
		pedido.setNomeProduto("Caneca Alice no País das Maravilhas Gato");
		pedido.setUrlImagem("https://images-na.ssl-images-amazon.com/images/I/31%2BwpubOrlL._AC_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/Caneca-Alice-Pa%C3%ADs-Maravilhas-Gato/dp/B085BRM5C5/?_encoding=UTF8&pd_rd_w=gsWuu&pf_rd_p=1c6d1c78-c691-4292-af98-b6a56e268b64&pf_rd_r=RQS6J517X3VN62JXDB0K&pd_rd_r=44edb74b-1983-4912-a680-6a4a29363504&pd_rd_wg=niuUY&ref_=pd_gw_crs_wish");
		pedido.setValor(new BigDecimal(29.90));
		pedidoRepository.save(pedido);
	}
}
