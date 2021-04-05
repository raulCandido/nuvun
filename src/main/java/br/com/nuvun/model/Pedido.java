package br.com.nuvun.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
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
