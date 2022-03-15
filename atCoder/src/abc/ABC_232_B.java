package abc;

import java.util.Scanner;


public class ABC_232_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			String s = sc.next();
			String t = sc.next();

			for (int i=0; i<26; i++) {
				if (t.equals(getCaeserEncode(s, i))) {
					System.out.println("Yes");
					System.exit(0);
				}
			}
			System.out.println("No");

		}

	}


	private static String getCaeserEncode( String s, int seed ) {

		char a = 'a';
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			char c_encoded = (char) ( a  +  (c -a + seed)%26);
			sb.append(c_encoded);
		}

		return sb.toString();


	}

}