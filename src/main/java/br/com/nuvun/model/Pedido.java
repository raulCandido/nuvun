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

	private String nomePedido;
	private BigDecimal valor;
	private LocalDate dataEntrega;
	private String urlProduto;
	private String urlImagem;

	public Pedido(String nomePedido, BigDecimal valor, LocalDate dataEntrega) {
		setNomePedido(nomePedido);
		setValor(valor);
		setDataEntrega(dataEntrega);

	}

}
