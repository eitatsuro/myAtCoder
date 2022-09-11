package abc;

import java.util.Scanner;

public class ABC_267_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String S = sc.next();
			S = S.toLowerCase();
			
			int ans=-1;
			if ("monday".equals(S)) {
				ans = 7-2;
			} else if ("tuesday".equals(S)) {
				ans = 7-3;
			} else if ("wednesday".equals(S)) {
				ans = 7-4;
			} else if ("thursday".equals(S)) {
				ans = 7-5;
			} else if ("friday".equals(S)) {
				ans = 7-6;
			} else if ("saturday".equals(S)) {
				ans = 7-7;
			} else if ("sunday".equals(S)) {
				ans = 7*2-7;
			} else {
				ans = -1;
			}
			
			System.out.println(ans);
		
		}
	}

}