package abc;

import java.util.Scanner;

public class ABC_276_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.next();
			int ans = s.lastIndexOf("a");
			System.out.println (ans > -1 ? ans+1 : ans );
		}
	}
}