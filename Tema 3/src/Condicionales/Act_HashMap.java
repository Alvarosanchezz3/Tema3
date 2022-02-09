package Condicionales;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;

public class Act_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		HashMap <String,String> hashmap = new HashMap <String,String>();
		
		hashmap.put("Enrique","Casanovas");
		hashmap.put("Bea","Cortes");
		hashmap.put("Antonio","Galisteo");
		hashmap.put("Matute","Rata");
		
		System.out.println("Dime un profesor:");
		String profesor = sc.next();
		
		System.out.println("Su apellido es: "+hashmap.get(profesor));
		Iterator<?> it= hashmap.entrySet().iterator();
		
		while (it.hasNext()) {
		}
		sc.close();
	}

}
