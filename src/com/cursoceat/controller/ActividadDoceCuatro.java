package com.cursoceat.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class ActividadDoceCuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//////////ACTIVIDAD 12.4///////////
		
	Collection<Integer> numeros = new ArrayList<>();
	System.out.println("Escriba un entero");
	Integer n = new Scanner(System.in).nextInt();
		while(n>=0) {
			numeros.add(n);
			System.out.println("Escriba un entero");
			n = new Scanner(System.in).nextInt();
		}//mostramos toda la colección
		System.out.println("Lista completa "+numeros);
		//mostramos los pares
		System.out.println("Numeros pares ");
		for(Integer num:numeros) {
			if(num%2 == 0) {
			System.out.print(num + " ");
			}
		}
		//eliminamos los multiplos de 3
		Iterator<Integer> it= numeros.iterator();
			//while verifica con hasnext si existe un prox elem
			while(it.hasNext()) {
			//next lee el proximo elemento y lo guarda en x
			Integer x = it.next();
				if(x%3==0) {
				it.remove();
				}
				}
			System.out.println("Lista sin multiplos de 3 "+ numeros);


	
	
	
}
}