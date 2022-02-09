package Tarea_ficheros;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new  Scanner (System.in);
		System.out.println("Introduce el nombre de un archivo para que te lea su contenido:");
		String archivo = sc.next();
		
		try {
			
			File ficheroescritura = new File ("C:\\users\\DAM\\Desktop\\ficheros\\"+ archivo);
			Scanner sc2= new Scanner(ficheroescritura);
			
			while (sc2.hasNextLine()) {
			String datos = sc2.next();
			System.out.print(datos+" "); 
			}
			sc2.close();
			
		} catch (IOException e) {
				System.out.println("Error de lectura"+e); }
		
		sc.close();
	}

}
