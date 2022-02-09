package Tarea_ficheros;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Introduce el nombre del fichero a escribir: ");
	        String docu= sc.nextLine();

	        String textovacio= " ";

	        try {
	        	 FileWriter escritura= new FileWriter("C:\\Users\\DAM\\Desktop\\ficheros\\"+ docu+".txt");
	            System.out.println("Introduce el mensaje: ");
	            
	            while(!textovacio.equals("")){
	            textovacio= sc.nextLine();
	            escritura.write(textovacio.toUpperCase()+ "\n");
	            }
	            escritura.close();

	        }catch(IOException e) {

	            System.out.println("Error de escritura:" +e);
	        }
	        
	        	sc.close();
	        }

		}
