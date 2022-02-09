package Acts_pokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in); 
		 System.out.println("Pokedex: ¿Que pokemon buscas?");
		 String pokemon = sc.nextLine();
		 boolean bucle = false;
		 
		 System.out.println("Que información quieres de él?");
		 
		 String info= sc.nextLine();
		 
		 // Metemos datos del pokemon 1 //
		 
		 List<String> pokemon_1 = new ArrayList <String>();
		 pokemon_1.add("Blastoise");
		 pokemon_1.add("Número en la pokédex: #009");
		 pokemon_1.add("Tipo del pokemon: Agua");
		 pokemon_1.add("Descripción: Es un Pokémon violento. Tiene reactores de agua en el caparazón, que le sirven para atacar con fuerza");
		 
		 // Metemos datos del pokemon 2 //
		 
		 List<String> pokemon_2 = new ArrayList <String>();
		 pokemon_2.add("Machamp");
		 pokemon_2.add("Número en la pokédex: #068");
		 pokemon_2.add("Tipo del pokemon: Lucha");
		 pokemon_2.add("Descripción: Es uno de los Pokémon de tipo lucha más fuertes, domina cualquier tipo de arte marcial; es capaz de dar 1000 golpes en tan solo 2 segundos");
		 
		 // Metemos datos del pokemon 3 //
		 
		 List<String> pokemon_3 = new ArrayList <String>();
		 pokemon_3.add("Gengar");
		 pokemon_3.add("Número en la pokédex: #094");
		 pokemon_3.add("Tipo del pokemon: Fantasma/veneno");
		 pokemon_3.add("Descripción: Es un pokemon de la 1º generación, la evolución de Haunter y, a partir de la sexta generación, puede megaevolucionar en Mega-Gengar");
		 
		 // Metemos datos del pokemon 4 //
		 

		 List<String> pokemon_4 = new ArrayList <String>();
		 pokemon_4.add("Alakazam");
		 pokemon_4.add("Número en la pokédex: #065");
		 pokemon_4.add("Tipo del pokemon: Psíquico");
		 pokemon_4.add("Descripción: Es un mono de tipo psíquico introducido en la primera generación. Es la evolución de Kadabra y evoluciona de este mediante un intercambio");
		 
		 // Metemos datos del pokemon 5 //
		 
		 List<String> pokemon_5 = new ArrayList <String>();
		 pokemon_5.add("Arcanine");
		 pokemon_5.add("Número en la pokédex: #059");
		 pokemon_5.add("Tipo del pokemon: Fuego");
		 pokemon_5.add("Descripción: Es capaz de correr 10000 km al día, lo que deja embelesados a todos los que lo ven pasar");
		 
			
		 // Te pide el nombre del pokemon y te imprime en consola la información que le pidas de él //
		 // Equals: Para que te pille el String en el if // 
		 // Se usa .get para coger la posición del arrayList //
		 // Meto un bucle para que pueda volver a preguntar info de otros pokemones //
		 
		 while (bucle==false) {		 
		
		if (pokemon.equals("Blastoise")) {
			
			if (info.equals("Toda")) {
				System.out.println(pokemon_1);
			}
			if (info.equals("Numero")) {
				System.out.println(pokemon_1.get(1));
			}
			if (info.equals("Tipo")) {
				System.out.println(pokemon_1.get(2));
			}
			if (info.equals("Descripcion")) {
				System.out.println(pokemon_1.get(3));
			}
		}
		
		if (pokemon.equals("Machamp")) {
			
			if (info.equals("Toda")) {
				System.out.println(pokemon_2);
			}
			if (info.equals("Numero")) {
				System.out.println(pokemon_2.get(1));
			}
			if (info.equals("Tipo")) {
				System.out.println(pokemon_2.get(2));
			}
			if (info.equals("Descripcion")) {
				System.out.println(pokemon_2.get(3));
			}
		}
		
		if (pokemon.equals("Gengar")) {
			
			if (info.equals("Toda")) {
				System.out.println(pokemon_3);
			}
			if (info.equals("Numero")) {
				System.out.println(pokemon_3.get(1));
			}
			if (info.equals("Tipo")) {
				System.out.println(pokemon_3.get(2));
			}
			if (info.equals("Descripcion")) {
				System.out.println(pokemon_3.get(3));
			}
		}
		
		if (pokemon.equals("Alakazam")) {
			
			if (info.equals("Toda")) {
				System.out.println(pokemon_4);
			}
			if (info.equals("Numero")) {
				System.out.println(pokemon_4.get(1));
			}
			if (info.equals("Tipo")) {
				System.out.println(pokemon_4.get(2));
			}
			if (info.equals("Descripcion")) {
				System.out.println(pokemon_4.get(3));
			}
		}
		
		if (pokemon.equals("Arcanine")) {
			
			if (info.equals("Toda")) {
				System.out.println(pokemon_5);
			}
			if (info.equals("Numero")) {
				System.out.println(pokemon_5.get(1));
			}
			if (info.equals("Tipo")) {
				System.out.println(pokemon_5.get(2));
			}
			if (info.equals("Descripcion")) {
				System.out.println(pokemon_5.get(3));
			}
		}
		System.out.println("(¿Quieres buscar otro pokemon?)");
		String resp = sc.nextLine();
		
		if (resp.equals("no")) {
			bucle=true;
			System.out.println("...Apagando pokédex...");
		}
		if (resp.equals("si")) {
			System.out.println("¿Que pokemon buscas?");
			pokemon=sc.nextLine();
			
			System.out.println("Que información quieres de él?");			 
			info= sc.nextLine();

			}
		
		 }
		
		sc.close();
	}

}
