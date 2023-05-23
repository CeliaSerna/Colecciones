package com.cursoceat.controller;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class ActividadDoceNueve {
static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	List<Integer> lista=new ArrayList<>();
	int n;
	boolean bandera=true;
	while(bandera) {
		n=validarOpcion();
		if(n<0) {
			bandera=false;
			break;
		}
		lista.add(n);
	}
	System.out.println(lista);
	System.out.println("indices de los valores pares");
	for(int i=0; i<lista.size();i++) {
		if(lista.get(i)%2==0) {
		System.out.println(i +" ");
		lista.set(i, lista.get(i)*100);
	}
	}
	System.out.println("\n"+lista);
	
	}
	
	/**
	 * metodo que utilizaremos para validar que el numero introducido es valido
	 * @return
	 */
	public static int validarOpcion() {
		int numero;
		System.out.println("Escriba un numero positivo");
		if (entrada.hasNextInt()) {
			numero=entrada.nextInt();
		}else {
		System.out.println("El valor es erroneo, intentalo otra vez");
		entrada.next();
		numero=validarOpcion();
		}
	return numero;
	
	
	}
	
}
