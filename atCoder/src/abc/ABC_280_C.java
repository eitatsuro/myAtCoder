package abc;

import java.util.Scanner;

public class ABC_280_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String S = sc.next();
			String T = sc.next();
			S=S+".";

			int ans = 0;
			int T_length = T.length();
			for (int i=0; i<T_length; i++) {
				if ( S.charAt(i) == T.charAt(i) ) {
					// do nothing
				} else {
					ans = i+1;
					break;
				}
			}
			
			System.out.println(ans);
			
			
		}
	}
}