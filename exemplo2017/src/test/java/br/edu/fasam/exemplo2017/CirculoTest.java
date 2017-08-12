package br.edu.fasam.exemplo2017;

import static org.junit.Assert.*;

import org.junit.Test;

public class CirculoTest {
	
	@Test
	public void validarAreaDoCirculoDeRaio4() {
		Circulo circulo = new Circulo(4.0);
		assertEquals(50.24, (double) circulo.getArea(), 0.03);
	}

	@Test
	public void validarPerimetroDoCirculoDeRaio6() {
		Circulo circulo = new Circulo(6.0);
		assertEquals(37.68, (double) circulo.getPerimetro(), 0.03);
	}
}
