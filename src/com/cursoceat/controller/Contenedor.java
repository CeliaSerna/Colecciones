package com.cursoceat.controller;

import java.util.Arrays;

/////////ACTIVIDAD 10.2////////////////////////
//public class Contenedor<T extends Comparable<T>>
////////ACTIVIDAD 10.3////////////////////////
public class Contenedor <T>implements Pila<T>, Cola<T> {
	private T[] objetos;

	public Contenedor(T[] objetos) {
	
		this.objetos = objetos;
	}
	void insertarAlFinal(T nuevo) {
		objetos = Arrays.copyOf(objetos, objetos.length+1);
		objetos[objetos.length-1]=nuevo;
		
	}
	void insertarAlPrincipio(T nuevo) {
		objetos = Arrays.copyOf(objetos, objetos.length+1);
		System.arraycopy(objetos, 0, objetos, 1, objetos.length-1);
		objetos[0]= nuevo;
	}
	T extraerDelFinal() {
		T resultado = null;
		if(objetos.length>0) {
			resultado= objetos[objetos.length-1];
			objetos=Arrays.copyOf(objetos, objetos.length-1);
		}
	return resultado;
	}
	
	T extraerDelPrincipio() {
		T resultado = null;
		if(objetos.length>0) {
			resultado=objetos[0];
			objetos= Arrays.copyOfRange(objetos, 1, objetos.length);
		}
	return resultado;
	}
	
	void ordenar() {
		Arrays.sort(objetos);
	}
	@Override
	public String toString() {
		return "Contenedor [objetos=" + Arrays.toString(objetos) + "]";
	}
	/////////ACTIVIDAD 10.3///////////////
	@Override
	public void apilar(T nuevo) {
		this.insertarAlPrincipio(nuevo);
		
	}
	@Override
	public T desapilar() {
		// TODO Auto-generated method stub
		return this.extraerDelPrincipio();
	}
	
	/////////////////////////////////
	@Override
	public void ponerFinal(T nuevo) {
		this.insertarAlFinal(nuevo);
		
	}
	@Override
	public T quitarPrincipio() {
		
		return extraerDelPrincipio();
	}
	
	
}
