package Acts_pokemon;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Pokemones iniciales de la regi�n de Kanto");		
		
		HashMap <String,String> pokemon1 = new HashMap <String,String>();
		pokemon1.put("Charmander","Tipo fuego , N� #004 de la pok�dex , La llama de su cola indica su fuerza vital. Si est� d�bil, la llama arder� m�s tenue //");
		pokemon1.put("Bulbasaur","Tipo planta/veneno , N� 001 de la pokedex , Lleva una semilla en su lomo desde que naci�. A medida que crece, la semilla se hace m�s grande //");
		pokemon1.put("Squirtle","Tipo agua , N� #007 de la pok�dex , Cuando se siente amenazado, esconde las patas dentro de la concha y expele agua por la boca //");
		
		System.out.println("\n"+"�De que pokemon quieres saber la informaci�n?");
		String eleccion = sc.nextLine();
		
		System.out.println("Pok�dex: "+pokemon1.get(eleccion));
		
		
		System.out.println("\n"+"�Quieres a�adir otros pokemones a la pok�dex?");
		String decision = sc.nextLine();
		 	
		   while (decision.equals("si")) { 		 
			 
			   System.out.println("�Que pokemon quieres a�adir?");
			   String nombre = sc.nextLine();
			   System.out.println("�De qu� tipo es?");
			   String tipo = sc.nextLine();
			   System.out.println("�Que n� de la pok�dex es?");
			   String num = sc.nextLine();
			   System.out.println("A�ade una peque�a descripci�n de �l:");
			   String desc = sc.nextLine();
			   
			   
			   pokemon1.put(nombre,"Tipo "+tipo+" , N� "+num+" en la pok�dex , "+desc+"//");
			   
			   System.out.println("Estos son los pokemones de tu pok�dex actualmente:"+"\n");
			   System.out.println(pokemon1);	
			   System.out.println("\n"+"Quieres a�adir m�s pokemones?");
			   decision = sc.nextLine();
			   
		   }    
		   System.out.println("...Apagando pok�dex...");
		   sc.close();
		}
	}


