package com.cursoceat.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ActividadProDoceTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Collection<Integer> numeros= new ArrayList<>();
	for(int i=1; i<=100; i++) {
		numeros.add((int)(Math.random()*10+1));
	}
		System.out.println(numeros);
	Iterator<Integer>it= numeros.iterator();
		while (it.hasNext()) {
			Integer x = it.next();
			if(x==5) {
				it.remove();
			}
		}
		System.out.println(numeros);
		
	}

}
