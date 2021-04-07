package br.com.nuvun.model.dto;

import br.com.nuvun.model.Pedido;
import lombok.Data;

@Data
public class PedidoDto {
	private String nomeProduto;
	private String urlProduto;
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
