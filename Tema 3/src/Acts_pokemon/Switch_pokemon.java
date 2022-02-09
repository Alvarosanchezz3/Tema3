package Acts_pokemon;
import java.util.Scanner;

public class Switch_pokemon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el pokemon:");
		String pokemon = sc.nextLine();
		
		switch (pokemon) {
		
		case "Blastoise":
			System.out.println("Tipo: Tipo agua");
			System.out.println("Numero: Nº #001 en la pokédex");
			System.out.println("Descripción: Es una tortuga que expulsa agua por la boca ");
			break;
			
		case "Gengar":
			System.out.println("Tipo: Tipo fantasma/veneno");
			System.out.println("Numero: Nº #002 en la pokédex");
			System.out.println("Descripción: Fantasma que ataca desde las sombras");
			break;
			
		case "Onix":
			System.out.println("Tipo: Tipo piedra");
			System.out.println("Numero: Nº #003 en la pokédex");
			System.out.println("Descripción: Aparece desde la tierra y ataca por sorpresa ");
			break;
		
		}
		
		sc.close();
	}

}
