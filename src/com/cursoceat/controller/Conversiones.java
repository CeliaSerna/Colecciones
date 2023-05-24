package com.cursoceat.controller;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Conversiones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//vamos a obtener un conjunto ordenado treeset a partir de otro que no lo este
		
		Set<Integer> conjuntoE=new LinkedHashSet<>();
		conjuntoE.add(4);
		conjuntoE.add(1);
		conjuntoE.add(5);
		conjuntoE.add(10);
		conjuntoE.add(3);
		System.out.println(conjuntoE);
	
		Set<Integer> conjuntoEordenado= new TreeSet<>();
		conjuntoEordenado.addAll(conjuntoE);
		System.out.println(conjuntoEordenado);
		
		conjuntoE=conjuntoEordenado;
		conjuntoE.add(15);
		
		System.out.println(conjuntoE);
		System.out.println(conjuntoEordenado);
		
		//2º forma de hacerlo
	
		Set<Integer> conjuntoE2ordenado=new TreeSet<>(conjuntoE);
		System.out.println("Conjunto 2 " +conjuntoE2ordenado);
	
		//crear conversiones de otro tipo de coleccion
		List<Integer> lista= new ArrayList<>();
		lista.add(4);
		lista.add(1);
		lista.add(5);
		lista.add(10);
		lista.add(3);
		lista.add(4);
		System.out.println("Lista "+lista);
		//convertimos la lista en un treeset
		
		Set<Integer> conjunto= new TreeSet<>(lista);
		System.out.println("conjunto "+ conjunto);
		
		lista= new ArrayList<>(conjunto);
		System.out.println("Lista sin repetidos "+ lista);
		
	}

}
