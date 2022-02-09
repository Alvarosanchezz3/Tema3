package Acts_pokemon;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Pokemones iniciales de la región de Kanto");		
		
		HashMap <String,String> pokemon1 = new HashMap <String,String>();
		pokemon1.put("Charmander","Tipo fuego , Nº #004 de la pokédex , La llama de su cola indica su fuerza vital. Si está débil, la llama arderá más tenue //");
		pokemon1.put("Bulbasaur","Tipo planta/veneno , Nº 001 de la pokedex , Lleva una semilla en su lomo desde que nació. A medida que crece, la semilla se hace más grande //");
		pokemon1.put("Squirtle","Tipo agua , Nº #007 de la pokédex , Cuando se siente amenazado, esconde las patas dentro de la concha y expele agua por la boca //");
		
		System.out.println("\n"+"¿De que pokemon quieres saber la información?");
		String eleccion = sc.nextLine();
		
		System.out.println("Pokédex: "+pokemon1.get(eleccion));
		
		
		System.out.println("\n"+"¿Quieres añadir otros pokemones a la pokédex?");
		String decision = sc.nextLine();
		 	
		   while (decision.equals("si")) { 		 
			 
			   System.out.println("¿Que pokemon quieres añadir?");
			   String nombre = sc.nextLine();
			   System.out.println("¿De qué tipo es?");
			   String tipo = sc.nextLine();
			   System.out.println("¿Que nº de la pokédex es?");
			   String num = sc.nextLine();
			   System.out.println("Añade una pequeña descripción de él:");
			   String desc = sc.nextLine();
			   
			   
			   pokemon1.put(nombre,"Tipo "+tipo+" , Nº "+num+" en la pokédex , "+desc+"//");
			   
			   System.out.println("Estos son los pokemones de tu pokédex actualmente:"+"\n");
			   System.out.println(pokemon1);	
			   System.out.println("\n"+"Quieres añadir más pokemones?");
			   decision = sc.nextLine();
			   
		   }    
		   System.out.println("...Apagando pokédex...");
		   sc.close();
		}
	}


