package com.softtek.java.Academi.examen;

public class ejercicio implements  problemas {

	@Override
	public int suma(int n, int m) {
		int s;
		s=n+m;
		return s;
	}

	@Override
	public int resta(int n, int m) {
		int r;
		r=n-m;
		return r;
	}

	@Override
	public double division(int n, int m) {
		int d;
		d= n/m;
		return d;
	}

	@Override
	public int multiplicacion(int n, int m) {
	int mul;
	mul=n*m;
		return mul;
	}
	

}
