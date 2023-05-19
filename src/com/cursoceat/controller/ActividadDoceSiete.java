package com.cursoceat.controller;

import java.util.ArrayList;
import java.util.Collection;

public class ActividadDoceSiete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Collection<Integer> n= new ArrayList<>();
	for(int i=0; i<10;i++) {
		Integer num=(int) (Math.random()*10+1);
	n.add(num);	
	}
	System.out.println("Original "+n);
	n.removeAll(borrar(5));
	System.out.println("Nueva "+(n));
	}
	public static <T> Collection<T> borrar(T n){
		Collection<T> nueva= new ArrayList<>();
		nueva.add(n);
		return nueva;
	}
}
