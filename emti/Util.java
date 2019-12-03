package com.softtek.java.Academi.emti;
import java.util.UUID;
public class Util {
	public String generateId() {
		String x= UUID.randomUUID().toString();
		return x;
	}
public static void main(String[]args) {
	Util u = new Util();
	for(int i=0;i<5;i++) {
		System.out.println(u.generateId());
	}
}
}
