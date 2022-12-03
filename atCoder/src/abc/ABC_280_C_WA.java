package abc;

import java.util.Scanner;

public class ABC_280_C_WA {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String S = sc.next();
			String T = sc.next();

			int S_length = S.length();
			int ans_assumption = S_length / 2;
			int ans_assumption_new = 0;
			int ans_min = 0;
			int ans_max = S_length-1;

			while (ans_min <= ans_max) {
				if ( T.startsWith(S.substring(0, ans_assumption))) {
					ans_min = ans_assumption;
				} else {
					ans_max = ans_assumption;
				}
				ans_assumption_new =  (ans_min + ans_max)/2;
				if (ans_assumption == ans_assumption_new) break;
				ans_assumption = ans_assumption_new;
			}
			
			// 答の付近を全探索する
			int ans = 0;
			for (int i=ans_min; i<S_length; i++) {
				if ( T.startsWith(S.substring(0, i))) {
					// do nothing
				} else {
					ans = i;
					break;
				}
			}
			
			System.out.println(ans);
			
			
		}
	}
}