package abc;

import java.util.Scanner;

public class ABC_239_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			long h = sc.nextLong();

			System.out.println(Math.sqrt(h*(12800000+h)));
		}
	}

}