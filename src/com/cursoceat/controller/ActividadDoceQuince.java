package com.cursoceat.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class ActividadDoceQuince {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Map<String, Integer>existencias = new TreeMap<>();
	
	try (
		ObjectInputStream in= new ObjectInputStream(
				
		new FileInputStream("C:\\Users\\PROGRAMACION\\Documentos\\JAVA\\Coleccioones\\archivo\\existencias.dat"))){
			existencias	= (TreeMap<String, Integer>) in.readObject();
			}catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
			}catch (IOException | ClassNotFoundException e) {
				System.out.println(e.getMessage());
			}
			int opcion;
			do {
				System.out.println("--- Elija una opción ---");
				System.out.println("1- Alta producto");
				System.out.println("2- Baja producto");
				System.out.println("3- Cambio stock producto");
				System.out.println("4- Listar existencias");
				System.out.println("5- Salir");
				opcion = new Scanner(System.in).nextInt();
				
				switch(opcion) {
				case 1->{
					System.out.println("Código producto: ");
					String codigo= new Scanner(System.in).nextLine();
					
					if (!existencias.containsKey(codigo)) {
					System.out.println("Stock del prodcuto: ");
					int stock = new Scanner(System.in).nextInt();
						existencias.put(codigo, stock);
					}else {
						System.out.println("El producto ya existe");
					}
				}
				
				case 2->{
					System.out.println("Código producto: ");
					String codigo= new Scanner(System.in).nextLine();
					existencias.remove(codigo);
					}
				case 3->{
					System.out.println("Código producto: ");
					String codigo= new Scanner(System.in).nextLine();
					System.out.println("Stock producto: ");
					int stock= new Scanner(System.in).nextInt();
					existencias.put(codigo, stock);
				}
				case 4->{
					System.out.println(existencias);
				}
				
				}
			}while (opcion!=5);
	
			try(ObjectOutputStream out= new ObjectOutputStream(
				new FileOutputStream("C:\\Users\\PROGRAMACION\\Documentos\\JAVA\\Coleccioones\\archivo\\existencias.dat"))){
			out.writeObject(existencias);	
			}catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
			}catch (IOException e) {
				System.out.println(e.getMessage());
			}
	}
		
		
		
	}


