package Demo;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		//Using user input
		//10 = 1,2,5
		
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number  ");
		int num=sc.nextInt();
		for(int i=2; i< num; i++) {
			if(num % i==0) {
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println("Number is Prime Number");
		}
		else
		{
			System.out.println("Number is not Prime Number");
		}

	}

}
