package abc;

import java.util.Scanner;

public class ABC_236_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			String s = sc.next();
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			StringBuilder sb = new StringBuilder();
			for (int i=1; i<=s.length(); i++) {
				if ( i == a ) {
					sb.append(s.charAt(b-1));
				} else if ( i == b ) {
					sb.append(s.charAt(a-1));
				} else {
					sb.append(s.charAt(i-1));
				}
			}
			
			System.out.println(sb.toString());
		}
	}

}