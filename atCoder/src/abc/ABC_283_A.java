package abc;

import java.util.Scanner;

public class ABC_283_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int K = sc.nextInt();
			
			char startChar = 'A';
			for(int i=0; i<K; i++) {
				System.out.print(startChar);
				startChar++;
			}

		}
	}
}
