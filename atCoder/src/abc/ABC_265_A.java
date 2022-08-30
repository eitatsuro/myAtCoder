package abc;

import java.util.Scanner;

public class ABC_265_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			int N = sc.nextInt();
			
			int candidate1 = N*X;
			int candidate2 = ((int)(N/3))*Y + X*(N%3);

			System.out.println( (candidate1 >= candidate2) ? candidate2 : candidate1 ); 
		
		}
	}

}