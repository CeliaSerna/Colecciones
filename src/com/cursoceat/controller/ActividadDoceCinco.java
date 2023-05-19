package com.cursoceat.controller;

import java.util.ArrayList;
import java.util.Collection;

public class ActividadDoceCinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Collection<Integer> lista=new ArrayList<>();
	
	for(int i=0; i<20; i++) {
		lista.add((int)(Math.random()*10+1));
	}
		System.out.println(lista);
	Collection<Integer>listaSinRepetidos = new ArrayList<>();
		for(Integer e :lista) {
			if(!listaSinRepetidos.contains(e)) {
				listaSinRepetidos.add(e);
			}
		}
		System.out.println(listaSinRepetidos);
	}

}
