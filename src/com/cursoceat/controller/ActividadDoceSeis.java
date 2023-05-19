package com.cursoceat.controller;

import java.util.ArrayList;
import java.util.Collection;

public class ActividadDoceSeis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Collection<Integer> numeros= new ArrayList<>();
	for(int i=1; i<=100; i++) {
		numeros.add((int)(Math.random()*10+1));
	}
		System.out.println(numeros);
		boolean eliminado= numeros.remove(5);
		//blucle directo sin el booleano
		while(numeros.remove(5));
		
		System.out.println(numeros);
	}

}
