package tanya.primeNumbers;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("type a number");
		int input = sc.nextInt();
	    sc.close();
	    
	    boolean isPrime = true;
	    
		for(int i=2; i<input; i++){
			if(input % i ==0){
				isPrime = false;
				break;
			}
		}
	    System.out.println("number is "+ (isPrime ? "": "not ")+ "prime");	   
	}
	
}
