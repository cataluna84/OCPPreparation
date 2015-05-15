package com.oca.chapter6;

public class LoopingScenarios {
	
	public static void main(String[] args) {
		
		//For loop can act like a while loop
		int i=0;
		labelled:
		for(;i<10;) {
			i++;
			System.out.println("like While: " + i);
			if(i==5) {
				System.out.println("Breaking out labelled");
				break labelled;
			}
		}
		
		int [][]twoDee = {{1,2,3},{4,5,6,},{7,8,9}};
		for(int []oneD:twoDee) {
			for(int a:oneD) {
				if(a == 4) break;
				System.out.println(a);
			}
		}
		
		System.out.println("Labelled break");
		labelled:
		for(int []oneD:twoDee) {
			for(int a:oneD) {
				if(a == 4) break labelled;
				System.out.println(a);
			}
		}

		System.out.println("Labelled continue");
		labelled:
		for(int []oneD:twoDee) {
			for(int a:oneD) {
				if(a == 4) continue labelled;
				System.out.println(a);
			}
		}
		
		System.out.println("Labelled continue used to print last element of each 1D array");
		labelled:
		for(i=0; i<twoDee.length; i++) {
			for(int j=0; j<twoDee[i].length; j++) {
				if(j == twoDee[i].length-1)
				System.out.println(twoDee[i][j]);
			}
		}

	}
}

class LoopingBADScenarios {
	public static void main(String[] args) {
		for(;;) {
			System.out.println("To infinity and beyond");
		}
	}
}