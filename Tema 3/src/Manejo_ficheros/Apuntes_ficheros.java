package Manejo_ficheros;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
	
public class Apuntes_ficheros {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new  Scanner (System.in);
		//System.out.println("Introduce el nombre del fichero que deseas crear");
		String documento = sc.next();
		
		// CREACIÓN DE FICHEROS 
/*
		try { 
			File fichero = new File("C:\\users\\DAM\\Desktop\\ficheros\\"+ documento);
			if (fichero.createNewFile()) {
				System.out.println("El fichero se ha creado");
			} else {
				System.out.println("Error en la creación del fichero");
			}
	  } catch (IOException e) {
			System.out.println("La ruta especificada es incorrecta");
			}
			
*/
		
		// ESCRITURA EN FICHEROS 
		

		
		try {
			FileWriter escritura = new FileWriter ("C:\\users\\DAM\\Desktop\\ficheros\\"+ documento);
			escritura.write("Viva el vino");
			escritura.close();
	  } catch (IOException e) {
			System.out.println("Error de escritura: "+e);
		}
		


		//LECTURA DE FICHEROS 
		
/*
		
	try {
		
		File ficheroescritura = new File ("C:\\users\\DAM\\Desktop\\ficheros\\"+ documento);
		Scanner sc2= new Scanner(ficheroescritura);
		
		while (sc2.hasNextLine()) {
		String datos = sc2.next();
		System.out.print(datos+" "); 
		}
		sc2.close();
		
	} catch (IOException e) {
			System.out.println("Error de lectura"+e); }
			
*/
	
	// ELIMINAR FICHEROS 
		
/*
	
	File ficheroborrado = new File ("C:\\users\\DAM\\Desktop\\ficheros\\");
	if (ficheroborrado.delete()) {
		System.out.println("Se ha borrado");
	} else  {
		System.out.println("No se ha borrado"+ ficheroborrado.getName());
		} 		
*/
	// LISTAR CONTENIDO DEL DIRECTORIO 

/*
	
	/*File dir = new File ("C:\\users\\DAM\\Desktop\\ficheros");
	String[] arraydeficheros = dir.list();
		for (String name:arraydeficheros) {
				System.out.println(Arrays.toString(arraydeficheros));
		}
*/
	sc.close();
	

	}
}
