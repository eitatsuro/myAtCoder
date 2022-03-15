package abc;

import java.util.Scanner;


public class ABC_221_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			long answer = 1;
			for (int i=0; i< a-b; i++) {
				answer*=32;
			}
			
			System.out.println(answer);

		}
	}
}