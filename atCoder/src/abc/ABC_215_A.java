package abc;

import java.util.Scanner;


public class ABC_215_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			String s = sc.next();

			if ("Hello,World!".equals(s)) {
				System.out.println("AC");
			} else { 
				System.out.println("WA");
			}


		}
	}
}