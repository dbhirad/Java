package Demo;

import java.util.Scanner;

public class RemoveVowels {

	public static void main(String[] args) {
	//	String s ="Apple";
	//	String a = s.toLowerCase();
		String z ="";
		int count=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Vowels");
		String s = sc.nextLine();
		
		String s1 = s.toLowerCase();
		for(int i= 0; i<=s1.length()-1; i++){
			char t=s1.charAt(i);
			
			if(t=='a'|| t=='e' || t=='i' || t=='o' ||t=='u') {
				count++;
				continue;
			}
			 z = z + t;
		}
		
		System.out.println(z);
		System.out.println("Number of vowels are "+count);
	}

}
