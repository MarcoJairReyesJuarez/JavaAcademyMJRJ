package com.softtek.java.Academi.examen;

import java.util.Scanner;

public class ejejrcicio3 {
	public boolean espalindromo(String cadena){
		boolean valor=true;
		int i,ind;
		String cadena2=" ";
		//quita los espacios
		for (int x=0; x < cadena.length(); x++) {
		if (cadena.charAt(x) != ' ')
		cadena2 += cadena.charAt(x);
		}
		// asigne variables
		cadena=cadena2;
		ind=cadena.length();
		//comparo cadenas
		for (i= 0 ;i < (cadena.length()); i++){
		if (cadena.substring(i, i+1).equals(cadena.substring(ind - 1, ind)) == false ) {
		
		valor=false;
		break;
		}
		ind--;
		
		}
		return valor;
		}
	public static void main(String[] args) {

		Scanner teclado= new Scanner(System.in);
		String nuevo;
		ejejrcicio3 objclass=new ejejrcicio3();
		System.out.println("Ingresa la palabra");
		nuevo = teclado.nextLine();
		if(objclass.espalindromo(nuevo)){
		System.out.println("no Palindromo");
		}
		else
		{
		System.out.println("es Palindromo");
		}
		}
}

