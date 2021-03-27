package br.com.nuvun.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Pedido {

	private String nomeProduto;
	private BigDecimal valor;
	private LocalDate dataEntrega;
	private String urlProduto;
	private String urlImagem;
	private String descricao;

	public Pedido(String nomeProduto, BigDecimal valor, LocalDate dataEntrega) {
		setNomeProduto(nomeProduto);
		setValor(valor);
		setDataEntrega(dataEntrega);

	}

}
