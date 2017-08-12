package br.edu.fasam.exemplo2017;

public class Circulo implements FiguraGeometrica {
	private Double raio;
	
	public Circulo(Double raio) {
		this.raio = raio;
	}
	
	public Double getArea() {
		return Math.PI*raio*raio;				
	}

	public Double getPerimetro() {
		return 2*Math.PI*raio;
	}

}
