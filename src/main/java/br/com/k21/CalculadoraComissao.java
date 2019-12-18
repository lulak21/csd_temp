package br.com.k21;

public class CalculadoraComissao {

	private static final int LIMITE_DE_VENDA = 10000;

	public static double calcular(double valorVenda) {

		double valorComissao;
		
		if (valorVenda <= LIMITE_DE_VENDA) {
			valorComissao = Math.floor(100 * (valorVenda * 5 / 100)) / 100;
		} else {
			valorComissao = valorVenda * 6 / 100;
		}

		return valorComissao;
	}

}
