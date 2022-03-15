package abc;

import java.util.Arrays;
import java.util.Scanner;

public class ABC_242_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			String s = sc.next();
			char[] s_char = new char[s.length()];
			s.getChars(0, s.length(), s_char, 0);
			
			Arrays.sort(s_char); //É\Å[Ég
			for(char temp : s_char ) {
				System.out.print(temp);
			}
			
		}
		
	}

}
