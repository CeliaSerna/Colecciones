package com.cursoceat.controller;
import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/////////////ACTIVIDAD 12.2/////////////
	/**	Contenedor<Integer> c = new Contenedor<>(new Integer[0] );
		for(int i = 0; i <20; i++) {
			c.insertarAlFinal((int) ( Math.random()*20));
		}
		System.out.println("Sin ordenar: " + c);
		c.ordenar();
		System.out.println("Ordenado: " + c);
		Integer numero = c.extraerDelPrincipio();
		System.out.println("Elemento extraido " + numero);
		System.out.println("Despues de extraer " + c);
	
	**/
		///////////ACTIVIDAD 10.3////////////////////
		
		Scanner entrada = new Scanner(System.in);
		Pila<Integer> miPila= new Contenedor<>(new Integer[0]);
		Cola<Integer> miFila= new Contenedor<>(new Integer[0]);
		System.out.println("Escribe numero entero positivo (-1 para terminar)");
		Integer numero= entrada.nextInt();
		
		while(numero!=-1) {
			miPila.apilar(numero);
			miFila.ponerFinal(numero);
			System.out.println("Escribe numero entero positivo (-1 para terminar)");
			numero= entrada.nextInt();
		}
		System.out.println(miPila.toString());
		System.out.println(miFila.toString());
		
		System.out.println("Desapilamos ");
		numero= miPila.desapilar();
		while(numero!=null) {
			System.out.println(numero+ " ");
			numero= miPila.desapilar();
		}
		System.out.println("");
	
		System.out.println("Vaciamos ");
		numero= miFila.quitarPrincipio();
		while(numero!=null) {
			System.out.println(numero+ " ");
			numero= miFila.quitarPrincipio();
		}
		System.out.println("");
	
	}

}
