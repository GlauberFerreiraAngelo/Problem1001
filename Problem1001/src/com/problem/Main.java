package com.problem;

public class Main {

	public static void main(String[] args) {
		
		Soma somaAeB = new Soma();
		int A, B, X;
		
		A = -10;
		B = 4;
		
		X = somaAeB.soma(A, B);
		
		System.out.println("X = " + X);
	}
}
