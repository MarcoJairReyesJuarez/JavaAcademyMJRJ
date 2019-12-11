package com.softtek.java.Academi.examen;

import java.util.Scanner;

public class ejercicio2 {
	public static void main (String []args) {
		Scanner L=new Scanner(System.in);
		int n,m,i,mult;
		System.out.println("dame un numero arriba de 0");
		n=L.nextInt();
		System.out.println("dame otro numero arriba de 0");
		m=L.nextInt();
		
			if(n>21 && m>21) {
				System.out.println("0");
			}
			if(n<22||m<22) {
			if(n<m) {
				System.out.println(n);}
			if(m<n) {
				System.out.println(m);
			}
		
			}
	}

}
