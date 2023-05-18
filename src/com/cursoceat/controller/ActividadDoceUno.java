package com.cursoceat.controller;

import java.util.Arrays;

public class ActividadDoceUno {

	public static void main(String[] args) {
	
	String cadenas[]= {};
	System.out.println(Arrays.toString(cadenas));
	cadenas= guardar("bicicleta", cadenas);
	cadenas= guardar("patinete", cadenas);
	cadenas= guardar("coche", cadenas);
	cadenas= guardar("moto", cadenas);
	
	System.out.println(Arrays.toString(cadenas));
	
	}
	

static <E> E[] guardar(E elemento, E[]tabla) {
	E[] nuevaTabla= Arrays.copyOf(tabla, tabla.length +1);
	nuevaTabla[nuevaTabla.length-1] = elemento;
	return nuevaTabla;
}
	
}