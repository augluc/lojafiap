package br.com.lojafiap.modelo;

public class Produto {
	/*
	 * Design Pattern: compilado de boas pr�ticas para OO
	 * DTO (Data Transfer Object): um padr�o que indica a melhor forma de representar uma classe modelo (do diagrama de classes) dentro da programa��o
	 * -> Todos os atributos ser�o privador
	 * -> Cada atributo deve possuir, individualmente, um m�todo de getters e setters
	 * -> ????????????????
	 * 
	 * 
	 * modelo = beans = javabeans = model = dto
	 */

	private int id;
	private String descricao;
	private double valorVenda;
	private double valorCompra;
	private int qtde;
	
	public Produto() {
		
	}

	public String getEstoque() {
		if(qtde>=20) {
			return "Estoque alto.";
		}else {
			if(qtde>=10 && qtde<20) {
				return "Estoque m�dio.";
			}
		}
		return "Estoque baixo.";
	}
	public void setAjustarValor(double porc) {
		valorVenda=valorVenda + (valorVenda*porc/100);
		valorCompra=valorCompra + (valorCompra*porc/100);
	} 
	public double getDesconto(double porc) {
		return valorVenda - valorVenda*(porc/100);
	}
	public double getDesconto() {
		return valorVenda*=0.9;
	}
	public String toString() {
		return
				"ID......................: " + id + "\n"+
				"Descri��o...............: " + descricao + "\n"+
				"Valor da Venda..........: " + valorVenda + "\n"+
				"Valor da Compra.........: " + valorCompra + "\n"+
				"Quantidade Dispon�vel...: " + qtde;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}
	public double getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	// <modificador> <tipo do retorno> <nome do m�todo> (<tipo do param> <nome do param>)

}
