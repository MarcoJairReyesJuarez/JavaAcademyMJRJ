package com.softtek.java.Academi.examen;

import java.util.Scanner;

public class resultados {
public static void main(String[]args) {
	Scanner L= new Scanner (System.in);
	int s,n,m;
	
	ejercicio co= new ejercicio();
	System.out.println("1- suma");
	System.out.println("2- resta");
	System.out.println("3- multiplicacion");
	System.out.println("4- division");
	System.out.println("Selecciona del 1 al 4");
	s=L.nextInt();
	switch(s) {
	case 1:
		
		System.out.println("dame 2 numeros");
		n=L.nextInt();
		m=L.nextInt();
		co.suma(n, m);
		System.out.println(co.suma(n, m));
		break;
case 2:
		
		System.out.println("dame 2 numeros");
		n=L.nextInt();
		m=L.nextInt();
		co.resta(n, m);
		System.out.println(co.resta(n, m));
		break;
case 3:
	
	System.out.println("dame 2 numeros");
	n=L.nextInt();
	m=L.nextInt();
	co.multiplicacion(n, m);
	System.out.println(co.multiplicacion(n, m));
	break;
case 4:
	
	System.out.println("dame 2 numeros");
	n=L.nextInt();
	m=L.nextInt();
	co.division(n, m);
	System.out.println(co.division(n, m));
	break;
	}
	
}
}
