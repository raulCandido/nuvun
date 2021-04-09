package br.com.nuvun.model.dto;

import javax.validation.constraints.NotBlank;

import br.com.nuvun.model.Pedido;
import lombok.Data;

@Data
public class PedidoDto {
	@NotBlank(message = "Campo Obrigatório")
	private String nomeProduto;

	@NotBlank(message = "Campo Obrigatório")
	private String urlProduto;

	@NotBlank(message = "Campo Obrigatório")
	private String urlImagemProduto;

	private String descricaoProduto;

	public Pedido converterPedidoDtoEmPedido() {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto(nomeProduto);
		pedido.setUrlProduto(urlProduto);
		pedido.setUrlImagem(urlImagemProduto);
		pedido.setDescricao(descricaoProduto);
		return pedido;
	}
}
