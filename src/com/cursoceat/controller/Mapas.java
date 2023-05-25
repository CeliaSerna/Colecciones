package com.cursoceat.controller;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Mapas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Double>alumnos = new HashMap<>();
		alumnos.put("Victoria", 1.55);
		alumnos.put("Irina", 1.64);
		alumnos.put("Carlos", 1.75);
		alumnos.put("Monica", 1.52);
		
		System.out.println(alumnos);
		//si quiero actualizar un dato, le volvemos a pasar clave y valor y lo sustituye
		alumnos.put("Carlos", 1.74);
		System.out.println("Carlos "+alumnos);
		
		//si queremos eliminar
		System.out.println("Eliminamos a Irina "+ alumnos.remove("Irina"));
		System.out.println("Eliminamos a Jose "+ alumnos.remove("Jose"));
		
		//para saber el valor de una clave
		System.out.println("Mónica tiene una altura de "+alumnos.get("Monica"));
		
		System.out.println("¿Existe Jose? "+ alumnos.containsKey("Jose"));
		System.out.println("¿Existe alguien que mida 1.55? "+ alumnos.containsValue(1.55));
		
		alumnos.put("Irina", 1.64);
		
		//vistas
		Set<String> clave=alumnos.keySet();
		System.out.println("Claves "+ clave);
		
		//mostrar valores
		Collection<Double> valores= alumnos.values();
		System.out.println("Valores "+ valores);
		
		Set<Map.Entry<String, Double>> entrada= alumnos.entrySet();
		System.out.println(entrada);
		
		alumnos.put("Azucena", 1.78);
		System.out.println(entrada);
		
		Iterator<Map.Entry<String, Double>> it;
		for (it =entrada.iterator();it.hasNext();) {
			Map.Entry<String, Double> elEntry= it.next();
			if (elEntry.getValue()<1.6) {
				it.remove();
			}
		}
		alumnos.put("Pedro", 1.8);
		System.out.println(entrada);
		System.out.println(alumnos);
		
		Map<String, Double>alumnoOrdenados= new TreeMap<>(alumnos);
		System.out.println(alumnoOrdenados);
		
		
		//limpiar
		alumnos.clear();
		System.out.println(alumnos);
	
		List<String> misAlumnos = new ArrayList<>();
		misAlumnos.add("Pedro");
		
		Map<Integer, List<String>> map = new HashMap<Integer, List<String>>();
		
		
		
		
	}

}
