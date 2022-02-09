package Manejo_ficheros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Actividad_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		
		String nombre;
		System.out.println("Introduce el nombre el alumno:");
		List<String> arrayAlumnos = new ArrayList <String>();
		
		do {
			nombre = sc.next();
			if (nombre.equals("ya")) {
				
			}else {
				arrayAlumnos.add(nombre);
			}
			
		} while (!nombre.equals("ya"));
		
		System.out.println(arrayAlumnos);
		
			sc.close();
		}
	}
