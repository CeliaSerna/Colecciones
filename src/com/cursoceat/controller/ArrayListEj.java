package com.cursoceat.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListEj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//metodods especificos de la interfaz List
	List<Integer> lista= new ArrayList<>();
	
		for(int i=1; i<=10; i++) {
			lista.add((int)(Math.random()*10+1));
		}
		System.out.println(lista);
		
		//acceder a un elemento indicando su indice
		System.out.println("Elemento posición 5 --> " + lista.get(5));
		
		//agregar un nuevo elemento
		//el metodo add siempre se agrega al final
		lista.add(100);
		System.out.println(lista);
		
		//sustituir el valor de un elemento indicando su indice
		lista.set(9, 200);
		System.out.println(lista);
		
		//incluir un nuevo elemento indicando su posicion, donde la lista hace hueco e inserta
		lista.add(1,150);
		System.out.println(lista);
		
		//incluir una lista dentro de otra lista
		List <Integer> otraLista=new ArrayList<>();
		otraLista.add(300);
		otraLista.add(400);
		otraLista.add(500);
		lista.addAll(4, otraLista);
		System.out.println(lista);
		
		//**************************************************
		/////////metodos por copiar//////////////////////////
		//**************************************************
		lista.remove(5);
		System.out.println(lista);
		
		//si quiero eliminar de la lista un elemento indicando su valor
		lista.remove(Integer.valueOf(500));
		System.out.println(lista);
		
		//metodo indexOf devuelve el indice de la primera ocurrencia el objeto que se pase
		System.out.println("indice del valor 150 en la lista --> "+lista.indexOf(150));
		
		//metodo lastIndexOf devuelve la ocurrencia del objeto comenzando su busqueda desde el final
		lista.add(8,300);
		System.out.println(lista);
		System.out.println("el ultimo indice del valor 300 en la lista es --> "+lista.lastIndexOf(300));

		//comparar parA ordenar utilizando comparator en orden natural
		Comparator<Integer> listaOrdenada = Comparator.naturalOrder();
		lista.sort(listaOrdenada);
		System.out.println(lista);
	
		//comparar parA ordenar utilizando comparator en orden decreciente
		Comparator<Integer> listaDrece = Comparator.reverseOrder();
		lista.sort(listaDrece);
		System.out.println(lista);
	
		//metodo equals, compara dos listas, true--> los mismos elementos y el mismo orden 
		// false--> en caso contrario
		System.out.println("¿la lista es igual a la otra? "+lista.equals(otraLista));
	
	}

}
