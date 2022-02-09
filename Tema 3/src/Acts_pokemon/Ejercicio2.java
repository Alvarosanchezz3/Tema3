package Acts_pokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
        
        System.out.println("�Que ruta escoges? (1 o 2)");
        
        String ruta = sc.nextLine();        
        
        List<ArrayList<String>> Ruta1 = new ArrayList<>(); // Pokemones ruta 1 //
        
        ArrayList<String> pokemon1 = new ArrayList<String>();
        pokemon1.add("Blastoise");
        pokemon1.add("Tipo agua");
        pokemon1.add("N� #009 de la pok�dex");
        pokemon1.add("Un brutal Pok�mon con reactores de agua en su caparaz�n.");
        Ruta1.add(pokemon1);
        
        ArrayList<String> pokemon2 = new ArrayList<String>();
        pokemon2.add("Charizard");
        pokemon2.add("Tipo fuego/volador");
        pokemon2.add("N� #006 de la pok�dex");
        pokemon2.add("Escupe fuego tan caliente que funde las rocas. ");
        Ruta1.add(pokemon2);
        
        ArrayList<String> pokemon3 = new ArrayList<String>();
        pokemon3.add("Venusaur");
        pokemon3.add("Tipo planta/veneno");
        pokemon3.add("N� #003 de la pok�dex");
        pokemon3.add("La planta florece cuando absorbe energ�a solar. ");
        Ruta1.add(pokemon3);
        
        ArrayList<String> pokemon4 = new ArrayList<String>();
        pokemon4.add("Pikachu");
        pokemon4.add("Tipo el�ctrico");
        pokemon4.add("N� #025 de la pok�dex");
        pokemon4.add("Varios de estos pokemons juntos pueden causar fuertes tormentas");
        Ruta1.add(pokemon4);
        
        
        List<ArrayList<String>> Ruta2 = new ArrayList<>(); // Pokemones ruta 2 //
        
        ArrayList<String> pokemon5 = new ArrayList<String>();
        pokemon5.add("Caterpie");
        pokemon5.add("Tipo bicho");
        pokemon5.add("N� #010 de la pok�dex");
        pokemon5.add("Si tocas sus receptores, soltar� un terrible olor para protegerse");
        Ruta2.add(pokemon5);
          
        ArrayList<String> pokemon6 = new ArrayList<String>();
        pokemon6.add("Mankey");
        pokemon6.add("Tipo lucha");
        pokemon6.add("N� #056 de la pok�dex");
        pokemon6.add("Tiene muy mal humor. A veces atacan sin motivo aparente.");
        Ruta2.add(pokemon6);
        
        ArrayList<String> pokemon7 = new ArrayList<String>();
        pokemon7.add("Weedle");
        pokemon7.add("Tipo bicho/veneno");
        pokemon7.add("N� #013 de la pok�dex");
        pokemon7.add("Le gustan las hojas y tiene un aguij�n venenoso en la cabeza");
        Ruta2.add(pokemon7);
        
        ArrayList<String> pokemon8 = new ArrayList<String>();
        pokemon8.add("Zubat");
        pokemon8.add("Tipo veneno/volador");
        pokemon8.add("N� #041 de la pok�dex");
        pokemon8.add("Emite sonidos ultras�nicos mientras vuela, para evitar obst�culos");
        Ruta2.add(pokemon8);
        

         // Ruta 1 //
         
          if (ruta.equals("Ruta 1")) {
              
              System.out.println("\n"+"Estos son tus pokemones: "+Ruta1);
              
              System.out.println("\n"+"�Quieres a�adir un pokemon?");
               String decision = sc.nextLine();     // Meto un string para que me responda a si quiero a�adir un pokemon //
               while (decision.equals("si")) {  // Meto un while para que haga un bucle para pedir pokemones mientras diga "si"//
                 
            	   ArrayList<String> pokemonnuevo1 = new ArrayList<String>();
                   Ruta1.add(pokemonnuevo1);
                 	
                   System.out.println("�Que pokemon quieres a�adir?");
                   String a�adirpokemon = sc.nextLine();
                   pokemonnuevo1.add(a�adirpokemon);
                   
                   System.out.println("�De que tipo es?");
                   String tipo = sc.nextLine();
                   pokemonnuevo1.add("Tipo "+tipo);
                   
                   System.out.println("�Que numero es de la pok�dex?");
                   String num =sc.nextLine();
                   pokemonnuevo1.add("N� #"+num+" de la pok�dex");
                   
                   System.out.println("Escribe una peque�a descripci�n:");
                   String desc =sc.nextLine();
                   pokemonnuevo1.add(desc);
                   
                   System.out.println(Ruta1);   
                   System.out.println("\n"+"Quieres a�adir m�s pokemones?");
                   decision = sc.nextLine();
                   
               }    
               System.out.println("...Game over...");
               }
               
            // Ruta 2 //
          
          if (ruta.equals("Ruta 2")) {
              
              System.out.println("\n"+"Estos son tus pokemones: "+Ruta2);
              
              System.out.println("\n"+"�Quieres a�adir un pokemon?");
               String decision = sc.nextLine();     // Meto un string para que me responda a si quiero a�adir un pokemon //
               while (decision.equals("si")) {  // Meto un while para que haga un bucle para pedir pokemones mientras diga "si"//
            	   
            	   ArrayList<String> pokemonnuevo2 = new ArrayList<String>();
                   Ruta2.add(pokemonnuevo2);
                   
                   System.out.println("�Que pokemon quieres a�adir?");
                   String a�adirpokemon = sc.nextLine();
                   pokemonnuevo2.add(a�adirpokemon);
                   
                   System.out.println("�De que tipo es?");
                   String tipo = sc.nextLine();
                   pokemonnuevo2.add("Tipo "+tipo);
                   
                   System.out.println("�Que numero es de la pok�dex?");
                   String num =sc.nextLine();
                   pokemonnuevo2.add("N� #"+num+" de la pok�dex");
                   
                   System.out.println("Escribe una peque�a descripci�n:");
                   String desc =sc.nextLine();
                   pokemonnuevo2.add(desc);
                   
                   System.out.println(Ruta2);   
                   System.out.println("\n"+"Quieres a�adir m�s pokemones?");
                   decision = sc.nextLine();
                   
               }    
               System.out.println("...Game over...");
               }
          sc.close();
      }
}