package br.edu.fasam.exemplo2017;

public class Quadrado implements FiguraGeometrica {
	
	private Double lado;

	public Quadrado(Double lado) {
		this.lado = lado;
	}
	
	public Double getArea() {
		return lado*lado;
	}
	
	public Double getPerimetro() {
		return 4*lado;
	}

}
