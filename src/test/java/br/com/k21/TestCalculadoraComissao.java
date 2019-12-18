package br.com.k21;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculadoraComissao {

	@Test
	public void UmaVendaDe500ReaisQueRetorna5Porcento() {
		int valorVenda = 500;
		int valorComissao = 25;
		
		double valorCalculado = CalculadoraComissao.calcular(valorVenda);
		
		Assert.assertEquals(valorComissao, valorCalculado, 0);
	}
	
	@Test
	public void UmaVendaDe10000ReaisQueRetorna5Porcento() {
		int valorVenda = 10000;
		int valorComissao = 500;
		
		double valorCalculado = CalculadoraComissao.calcular(valorVenda);
		
		Assert.assertEquals(valorComissao, valorCalculado, 0);
	}
	
	@Test
	public void UmaVendaDe100ReaisQueRetorna5Porcento() {
		int valorVenda = 100;
		int valorComissao = 5;
		
		double valorCalculado = CalculadoraComissao.calcular(valorVenda);
		
		Assert.assertEquals(valorComissao, valorCalculado, 0);
	}
	
	@Test
	public void UmaVendaDe11000ReaisQueRetorna6Porcento() {
		int valorVenda = 11000;
		int valorComissao = 660;
		
		double valorCalculado = CalculadoraComissao.calcular(valorVenda);
		
		Assert.assertEquals(valorComissao, valorCalculado, 0);
	}
	
	@Test
	public void UmaVendaDeMenos50_10ReaisQueRetorna5Porcento() {
		double valorVenda = 50.10;
		double valorComissao = 2.50;
		
		double valorCalculado = CalculadoraComissao.calcular(valorVenda);
		
		Assert.assertEquals(valorComissao, valorCalculado, 0);
	}
	
	@Test
	public void UmaVendaDeMenos55_59ReaisQueRetorna5Porcento() {
		double valorVenda = 55.59;
		double valorComissao = 2.77;
		
		double valorCalculado = CalculadoraComissao.calcular(valorVenda);
		
		Assert.assertEquals(valorComissao, valorCalculado, 0);
	}
	
	@Test
	public void UmaVendaDeMenos10001ReaisQueRetorna6Porcento() {
		double valorVenda = 10001;
		double valorComissao = 600.06;
		
		double valorCalculado = CalculadoraComissao.calcular(valorVenda);
		
		Assert.assertEquals(valorComissao, valorCalculado, 0);
	}

	
	
}