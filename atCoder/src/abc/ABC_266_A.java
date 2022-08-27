package abc;

import java.util.Scanner;

public class ABC_266_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.next();
			System.out.println(s.charAt( (s.length()-1)/2));
		
		}
	}

}