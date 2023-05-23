package com.cursoceat.controller;
import java.util.Scanner;
public class bucleMultiplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada = new Scanner(System.in);




		System.out.println("escribe numero");
		double numero = entrada.nextDouble();
		 double producto= numero;
		 for (int i=0; i<4;i++) {
			System.out.println("escribe numero");
		 numero = entrada.nextDouble();
		 producto = producto/numero;
		 }
		   
		
		System.out.println(producto);
		
	}
}

