package com.softtek.java.Academi.examen;

import java.util.ArrayList;

public class ejercicio4 {
public static void main (String[]args) {
	ArrayList x = new ArrayList();
	ArrayList y = new ArrayList();
	
	
	x.add(1);
	x.add(2);
	x.add(3);
	x.add(4);
	x.add(5);
	x.add(6);
	
	y.add(7);
	y.add(8);
	y.add(9);
	y.add(8);
	y.add(5);
	System.out.println("este es"+x.get(1) + x.get(4));
	System.out.println("este "+ y.get(0)+ y.get(4));
}
}
