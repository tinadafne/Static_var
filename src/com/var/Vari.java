package com.var;

public class Vari {
	static int CV = 100;
	int mv=87;

	private void varmtd() {
	int CV=5;
	System.out.println("local variable");
	System.out.println(CV);/// local var

	}
	public static void main(String[] args) {
		
		Vari f = new Vari();
		f.varmtd();
		System.out.println("static variable");
		System.out.println(CV);/// no ref object
		System.out.println("class variable");
		System.out.println(f.mv);/// ref obj
	}
	

	
	
	
	

}
