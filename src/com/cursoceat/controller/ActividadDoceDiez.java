package com.cursoceat.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ActividadDoceDiez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	List<Integer> lista= new ArrayList<>();
	for(int i=0; i<20; i++) {
		lista.add((int)(Math.random()*10+1));
	}
	Comparator<Integer> c= Comparator.naturalOrder();
	lista.sort(c);
	System.out.println("Lista original "+ lista);
	Set<Integer> sinRepes = new TreeSet<>();
	sinRepes.addAll(lista);
	System.out.println("Sin repetidos "+sinRepes);
	
	Set<Integer> repetidos = new TreeSet<>();
	for (Integer e: sinRepes) {
		lista.remove(e);	
	}
	repetidos.addAll(lista);
	
	System.out.println("repetidos " + repetidos);
	
		
	}

}
