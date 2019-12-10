package com.softtek.java.Academi.examen;
import java.util.Scanner;
public class Ejercicio1 {
	


	
	public static void main (String []args) {
		Scanner L=new Scanner(System.in);
		int n,i,mult;
		System.out.println("dame un numero");
		n=L.nextInt();
		for(i=0;i<=10;i++) {
			mult=n*i;
			System.out.println(n + "x" + i + "=" + " " + mult );
			
		}
		
		
	}

	

}
