package edu.cnm.deepdive;

public class PE6 {

	public PE6() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int sumSquares = 0;
		int squareSums = 0;
		int square = 0;
		int sum = 0;
		
		for (int i = 1; i<=100; i++){
			square = i * i;
			sumSquares +=square;
			
			sum +=i;
			squareSums = sum * sum;
			
			
		}
		System.out.println(sumSquares);
		System.out.println(squareSums);
		
		System.out.println(squareSums - sumSquares);
		

	}

}
