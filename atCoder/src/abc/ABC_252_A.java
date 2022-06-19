package abc;

import java.util.Scanner;

public class ABC_252_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
		
			char a = 'a';
			a = (char) (a + N - 97);
			System.out.println(a);
		}
	}

}