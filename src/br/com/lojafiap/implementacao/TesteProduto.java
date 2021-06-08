package br.com.lojafiap.implementacao;

import br.com.lojafiap.modelo.Produto;

public class TesteProduto {

	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.setId(101);
		produto.setDescricao("Filme, só que sem os cachorros.");
		produto.setQtde(15);
		produto.setValorCompra(35);
		produto.setValorVenda(100);

		produto.toString();
		System.out.println(produto.toString());

		System.out.println("10% -> " + produto.getDesconto());
		System.out.println("20% -> " + produto.getDesconto(20));
		System.out.println("Estoque -> " + produto.getEstoque());

		produto.setAjustarValor(18);

		System.out.println("Valor de Venda -> " + produto.getValorVenda());
		System.out.println("Valor de Compra -> " + produto.getValorCompra());



	}

}
