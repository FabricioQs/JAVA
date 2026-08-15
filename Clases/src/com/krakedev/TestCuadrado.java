package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		
		System.out.println("=========Cuadrado 1==============");
		
		Cuadrado c1 = new Cuadrado();
		c1.lado = 5;
		
		double resultadoArea;
		resultadoArea = c1.calcularArea();
		System.out.println("El área del cuadrado 1 es: " + resultadoArea);
		
		double resultadoPerimetro;
		resultadoPerimetro = c1.calcularPerimetro();
		System.out.println("El perímetro del cuadrado 1 es: " + resultadoPerimetro);
		
		System.out.println("=========Cuadrado 2==============");
		
		Cuadrado c2 = new Cuadrado();
		c2.lado = 2;
		
		double resultadoArea2;
		resultadoArea2 = c2.calcularArea();
		System.out.println("El área del cuadrado 2 es: " + resultadoArea2);
		
		double resultadoPerimetro2;
		resultadoPerimetro2 = c2.calcularPerimetro();
		System.out.println("El perímetro del cuadrado 2 es: " + resultadoPerimetro2);
		
		System.out.println("=========Cuadrado 3==============");
		
		Cuadrado c3 = new Cuadrado();
		c3.lado = 7;
		
		double resultadoArea3;
		resultadoArea3 = c3.calcularArea();
		System.out.println("El área del cuadrado 3 es: " + resultadoArea3);
		
		double resultadoPerimetro3;
		resultadoPerimetro3 = c3.calcularPerimetro();
		System.out.println("El perímetro del cuadrado 3 es: " + resultadoPerimetro3);
	
	}

}
