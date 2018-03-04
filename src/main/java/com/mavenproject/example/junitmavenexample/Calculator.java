package com.mavenproject.example.junitmavenexample;

public class Calculator implements ICalculator{

	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	public int subtraction(int a, int b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	public int multiplication(int a, int b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	public int divison(int a, int b) throws Exception {
		// TODO Auto-generated method stub
		if(b==0) {
			throw new Exception("Divider can't be zero");
		}
		
		return a/b;
	}

	public boolean equalIntegers(int a, int b) {
		// TODO Auto-generated method stub
		boolean result = false;
		if(a==b) {
			result = true;
		}
		return result;
	}

}
