package Acts_pokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Decisiones del entrenador pokemon: // 1� Elegir ruta (1 o 2) // 2� Capturar pokemones // 3� Consultar pokedex");
		String decision_entrenador = sc.nextLine();	
		boolean repetir = false;
		
		// POK�DEX //
		
		List<String> Ruta1 = new ArrayList <String>();
		 Ruta1.add("Blastoise");
		 Ruta1.add("Machamp");
		 Ruta1.add("Gengar");

		 List<String> Ruta2 = new ArrayList <String>();
		 	 
		 Ruta2.add("Alakazam");
		 Ruta2.add("Arcanine");
		 Ruta2.add("Jolteon");
		 
		 
		 List<String> pokemon_1 = new ArrayList <String>();
		 pokemon_1.add("Blastoise");
		 
		 List<String> pokemon_2 = new ArrayList <String>();
		 pokemon_2.add("Machamp"); 
		 
		 List<String> pokemon_3 = new ArrayList <String>();
		 pokemon_3.add("Gengar");  

		 List<String> pokemon_4 = new ArrayList <String>();
		 pokemon_4.add("Alakazam");	
		 
		 List<String> pokemon_5 = new ArrayList <String>();
		 pokemon_5.add("Arcanine");
		 
		 List<String> pokemon_6 = new ArrayList <String>();		 
		 pokemon_6.add("Jolteon");
		 
		 // Eliges Ruta y luego decides si capturar o no pokemon //
		 
		while (repetir==false) {		
			
		if(decision_entrenador.equals("Elegir ruta")) {
			System.out.println("�A que ruta quieres ir?");
			String ruta = sc.nextLine();
			System.out.println("Has elegido la "+ruta+"\n");		
			
			if(ruta.equals("Ruta 1")){
			
				int pokemon_random = (int) (Math.random()* Ruta1.size());
				System.out.println("Wow, has encontrado un "+Ruta1.get(pokemon_random)+" salvaje"+" �Quieres capturarlo o huir?");
				String dedision_captura =sc.nextLine();
				if (dedision_captura.equals("Capturar")){
					System.out.println("Bien hecho! - "+Ruta1.get(pokemon_random)+" se ha a�adido a la pokedex");
					if (Ruta1.get(pokemon_random).equals("Blastoise")) {
						pokemon_1.add("N�mero de la pok�dex: #009");
						pokemon_1.add("Tipo del pokemon: Es tipo agua");
						pokemon_1.add("Descripci�n: Es un Pok�mon violento. Tiene reactores de agua en el caparaz�n, que le sirven para atacar con fuerza"); 
						 System.out.println(pokemon_1);
					}
					
					if (Ruta1.get(pokemon_random).equals("Machamp")) {
						 pokemon_2.add("N�mero en la pok�dex: #068");
						 pokemon_2.add("Tipo del pokemon: Es tipo lucha");
						 pokemon_2.add("Descripci�n: Es uno de los Pok�mon de tipo lucha m�s fuertes, dominando cualquier tipo de arte marcial; es capaz de dar 1000 golpes en tan solo 2 segundos");
						 System.out.println(pokemon_2);
					}
					
					if (Ruta1.get(pokemon_random).equals("Gengar")) {
						 pokemon_3.add("N�mero en la pok�dex: #094");
						 pokemon_3.add("Tipo del pokemon: Es tipo fantasma y veneno");
						 pokemon_3.add("Descripci�n: Es un pokemon de la 1� generaci�n, la evoluci�n de Haunter y, a partir de la sexta generaci�n, puede megaevolucionar en Mega-Gengar"); 
						 System.out.println(pokemon_3);
					}
					
				}
				if (dedision_captura.equals("Huir")){
					System.out.println( "Se ha guardado informaci�n acerca de "+Ruta1.get(pokemon_random)+" en la pokedex");
					if (Ruta1.get(pokemon_random).equals("Blastoise")) {
						pokemon_1.add("N�mero en la pok�dex: #009");
						pokemon_1.add("Tipo del pokemon: Es tipo agua");
						System.out.println(pokemon_1);
					}
					
					if (Ruta1.get(pokemon_random).equals("Machamp")) {
						 pokemon_2.add("N�mero en la pok�dex: #068");
						 pokemon_2.add("Tipo del pokemon: Es tipo lucha");
						 System.out.println(pokemon_2);
					}
					
					if (Ruta1.get(pokemon_random).equals("Gengar")) {
						 pokemon_3.add("N�mero en la pok�dex: #094");
						 pokemon_3.add("Tipo del pokemon: Es tipo fantasma y veneno");
						 System.out.println(pokemon_3);
					}
				}
				
			}else{
				
				int pokemon_random = (int) (Math.random()* Ruta2.size());
				System.out.println("Wow, has encontrado un "+Ruta2.get(pokemon_random)+" salvaje"+" �Quieres capturarlo o huir?");
				String decision_captura = sc.nextLine();
				if (decision_captura.equals("Capturar")){
					System.out.println("Bien hecho! - "+Ruta2.get(pokemon_random)+" se ha a�adido a la pokedex");
					if (Ruta2.get(pokemon_random).equals("Alakazam")) {
						 pokemon_4.add("N�mero en la pok�dex: #065");
						 pokemon_4.add("Tipo del pokemon: Es tipo ps�quico");
						 pokemon_4.add("Descripci�n: Es un mono de tipo ps�quico introducido en la primera generaci�n. Es la evoluci�n de Kadabra y evoluciona de este mediante un intercambio"); 
						 System.out.println(pokemon_4);
					}
					
					if (Ruta2.get(pokemon_random).equals("Arcanine")) {				 
						 pokemon_5.add("N�mero en la pok�dex: #059");
						 pokemon_5.add("Tipo del pokemon: Es tipo fuego");
						 pokemon_5.add("Descripci�n: Es capaz de correr 10000 km al d�a, lo que deja embelesados a todos los que lo ven pasar"); 
						 System.out.println(pokemon_5);
					}
					
					if (Ruta2.get(pokemon_random).equals("Jolteon")) {
						 pokemon_6.add("N�mero en la pok�dex: #135");
						 pokemon_6.add("Es tipo el�ctrico");
						 pokemon_6.add("Se carga de electricidad cada vez que cambia de humor, genera un nivel bajo de electricidad, cuya intensidad aumenta con la electricidad est�tica");
						 System.out.println(pokemon_6);
					}
					
				}
				if (decision_captura.equals("Huir")){
					System.out.println( "Se ha guardado informaci�n acerca de "+Ruta2.get(pokemon_random)+" en la pokedex");
					if (Ruta2.get(pokemon_random).equals("Alakazam")) {
						pokemon_4.add("N�mero en la pok�dex: #065");
						pokemon_4.add("Tipo del pokemon: Es tipo ps�quico");
						System.out.println(pokemon_4);
					}
					
					if (Ruta2.get(pokemon_random).equals("Arcanine")) {
						 pokemon_5.add("N�mero en la pok�dex: #059");
						 pokemon_5.add("Tipo del pokemon: Es tipo fuego");
						 System.out.println(pokemon_5);
					}
					
					if (Ruta2.get(pokemon_random).equals("Jolteon")) {
						 pokemon_6.add("N�mero en la pok�dex: #135");
						 pokemon_6.add("Es tipo el�ctrico");
						 System.out.println(pokemon_6);
					}
				}
			}
		}
			System.out.println("\n"+"�Que quieres hacer ahora?");
			decision_entrenador= sc.nextLine();
			
		
		// Si eliges Consultar pokedex //
		
		if (decision_entrenador.equals("Consultar pokedex")) {
			System.out.println("�De que pokemon quieres informaci�n?");
			String pokemon = sc.nextLine();
			System.out.println("�Que informaci�n quieres de �l?");
			String info = sc.nextLine();
			
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
			
			if (pokemon.equals("Jolteon")) {
				
				if (info.equals("Toda")) {
					System.out.println(pokemon_6);
				}
				if (info.equals("Numero")) {
					System.out.println(pokemon_6.get(1));
				}
				if (info.equals("Tipo")) {
					System.out.println(pokemon_6.get(2));
				}
				if (info.equals("Descripcion")) {
					System.out.println(pokemon_6.get(3));
				}
			}
		System.out.println("(�Quieres continuar jugando?)");
		String bucle = sc.nextLine();
		if (bucle.equals("no")) {
			repetir=true;
			System.out.println("...Guardando tus datos...");
			System.out.println("...Apagando...");
		}
		if (bucle.equals("Si")) {
			System.out.println("\n"+"�Que quieres hacer ahora?");
			decision_entrenador= sc.nextLine();
			}
		 }
	  } 
		sc.close();
	}
}
