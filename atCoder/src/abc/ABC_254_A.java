package abc;

import java.util.Scanner;

public class ABC_254_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			
			if ( N%100 >= 10 ) {
				System.out.println(N%100);	
			} else if (N%100 >= 1 && N%100 <= 9 ) {
				System.out.println("0" + N%100);
			} else {
				System.out.println("00");
			}
		
		}
	}

}