package com.cursoceat.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class ActividadDoceOcho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Collection<Integer> lista= new ArrayList<>();
	for(int i=1; i<=20; i++) {
		lista.add((int)(Math.random()*10+1));
	}
		System.out.println("Colección original");
		System.out.println(lista);
		//crear una tabla del mismo tipo de coleccion para luego utilizar el metodo sort
		
		Integer[] tabla= lista.toArray(new Integer[0]);
		Arrays.sort(tabla);
		for(int i=0; i<tabla.length;i++) {
			System.out.print(tabla[i]+ " ");
		}
		
		//vamos a insertar esta tabla en una nueva coleccion
		Collection<Integer>listaCre= new ArrayList<>();
		listaCre.addAll(Arrays.asList(tabla));
		System.out.println("\n"+listaCre);
		
		//nos pide mostrar la lista de forma decreciente, de mayor a menor
		Comparator<Integer> ordenDecre= Comparator.naturalOrder();
		ordenDecre= ordenDecre.reversed();
		//creado el comparador 
		
		Arrays.sort(tabla,ordenDecre);
		System.out.println(Arrays.toString(tabla));
		
		//la tabla ordenada instarla en una coleccion llamada ordenDecre
		Collection<Integer> listaDecre = new ArrayList<>();
		listaDecre.addAll(Arrays.asList(tabla));
		System.out.println("Colección en orden decreciente \n"+listaDecre);
		
		
		
	}

}
