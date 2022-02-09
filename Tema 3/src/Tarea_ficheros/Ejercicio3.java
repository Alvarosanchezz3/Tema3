package Tarea_ficheros;

import java.io.File;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in); 
		 
		 System.out.println("Introduzca la extension:");
		 String extension = sc.next();
		 
		 File dir= new File("C:\\Users\\DAM\\Desktop\\ficheros");  
		 
		 String[] ficheros= dir.list();        
		 
		 for(int i=0; i<ficheros.length;i++) {
			 if(ficheros[i].contains("."+ extension)) {
				 System.out.println(ficheros[i]);
				 
			 }                  
		 }
		 sc.close();
	}

}
