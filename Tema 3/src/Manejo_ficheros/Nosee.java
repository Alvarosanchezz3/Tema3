package Manejo_ficheros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nosee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.println("Array: ");
		List<Integer> array1= new ArrayList <Integer>();
		List<Integer> array2= new ArrayList <Integer>();
		
		array1.add(0);
		array1.add(1);
		array1.add(2);
		array1.add(3);
		array1.add(4);
		array1.add(5);
		array1.add(6);
		array1.add(7);
		array1.add(8);
		array1.add(9);
		array1.add(10);
		
		System.out.println(array1);
		
		System.out.println("\n"+"Introduce el primer número: ");
		int num1 = sc.nextInt();
		System.out.println("Introduce el segundo número: ");
		int num2 = sc.nextInt();
		
		for (int i = num1;i<=num2;i++) {
			array2.add(array1.get(i));
		}
		System.out.println(array2);
		sc.close();
	}
	

}
