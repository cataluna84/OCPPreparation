package com.oca.chapter6;

public class LoopingScenarios {
	
	public static void main(String[] args) {
		
		//For loop can act like a while loop
		int i=0;
		for(;i<10;) {
			i++;
			System.out.println("like While: " + i);
		}
		
		int [][]twoDee = {{1,2,3},{4,5,6,},{7,8,9}};
		for(int []oneD:twoDee) {
			if(oneD[0] == 4) break;
			for(int a:oneD) {
				System.out.println(a);
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