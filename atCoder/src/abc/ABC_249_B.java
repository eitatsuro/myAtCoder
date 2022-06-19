package abc;

import java.util.Arrays;
import java.util.Scanner;

public class ABC_249_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			String s = sc.next();

			if ( !( s.matches(".*[A-Z]+.*") && s.matches(".*[a-z]+.*") ) ) {
				System.out.println("No");
				System.exit(0);
			}
			
			char[] s_char = new char[s.length()];
			
			s.toLowerCase();
			for (int i=0; i<s.length(); i++) {
				s_char[i] = s.charAt(i);
			}
			
			Arrays.sort(s_char);
			
			for (int i=0; i<s.length() -1; i++) {
				if (s_char[i] == s_char[i+1]) {
					System.out.println("No");
					System.exit(0);
				}
			}
			
			System.out.println("Yes");

		}

	}



}