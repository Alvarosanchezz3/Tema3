package Manejo_ficheros;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class Array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.println("Esto es un Array de colores:");
		
		List<String> arrayColores = new ArrayList <String>();
		arrayColores.add("Rojo");
		arrayColores.add("Azul esperanza");
		arrayColores.add("Amarillo v�mito");
		arrayColores.add("Verde marihuana");
		
		sc.close();
		
		System.out.println(arrayColores);
		
		arrayColores.set(2, "Amarillo v�mito");
		System.out.println("\n"+"El valor en la posici�n 2 es: "+arrayColores.get(2));
		
		arrayColores.remove(2);
		System.out.println("Este es el array sin la posici�n 2: "+arrayColores);
	}

}

