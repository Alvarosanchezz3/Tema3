package Manejo_ficheros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array_List_invertido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);

		List<String> arrayAlumnos = new ArrayList <String>();
		arrayAlumnos.add("Pablinho");
		arrayAlumnos.add("Juankimen");
		arrayAlumnos.add("Roro");
		arrayAlumnos.add("Andres_kako");
		
		sc.close();
		
		System.out.println("Array: "+ arrayAlumnos);
		
		String aux;
		
		for (int i=0;i<arrayAlumnos.size()/2;i++) {
			aux = arrayAlumnos.get(i);
			arrayAlumnos.set(i, arrayAlumnos.get(arrayAlumnos.size()-(i+1)));
			arrayAlumnos.set(arrayAlumnos.size()-(i+1), aux);
		}
		System.out.println("Array invertido: "+arrayAlumnos);
	}

}
