package abc;

import java.util.Scanner;

public class ABC_256_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			long ans = (long) Math.pow(2, N); 
			System.out.println(ans);
		
		}
	}

}