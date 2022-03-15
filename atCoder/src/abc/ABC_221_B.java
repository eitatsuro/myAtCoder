package abc;

import java.util.Scanner;


public class ABC_221_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			
			String s = sc.next();
			String t = sc.next();
			
			// 0‰ñ‚Ì“ü‚ê‘Ö‚¦‚Åˆê’v‚·‚éê‡
			if ( s.equalsIgnoreCase(t) ) {
				System.out.println("Yes");
				System.exit(0);
			}
			
			StringBuilder sb = new StringBuilder();
			for ( int i=0; i < s.length() - 1; i++ ) {
				char p = s.charAt(i);
				char q = s.charAt(i+1);
				sb.delete(0, s.length());
				sb.append(s.substring(0, i));
				sb.append(q);
				sb.append(p);
				sb.append(s.substring(i+2, s.length()));
				
				if ( sb.toString().equals(t) ) {
					System.out.println("Yes");
					System.exit(0);
				} 
			}
			
			System.out.println("No");
			System.exit(0);

		}
	}
}