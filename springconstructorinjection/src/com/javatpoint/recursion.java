package com.javatpoint;

public class recursion {

	public static void main(String[] args) {
		int num = fibonacci(10, 0, 1);
	}

	private static int fibonacci(int number, int first, int second) {
		
//System.out.println(number+" "+first+ " "+second);
		int next=first+second;
		System.out.print(second+",");
		if(number<=0)
			return second;
		else return fibonacci(--number, second, next);
	}
}
