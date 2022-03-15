package abc;

import java.util.Scanner;


public class ABC_233_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int l = sc.nextInt();
			int r = sc.nextInt();
			String s = sc.next();
			
			String parts = s.substring(l-1, r);

			StringBuilder sb_reverse = new StringBuilder();
			sb_reverse.append(parts);
			sb_reverse.reverse();
			
			StringBuilder sb_ans = new StringBuilder();
			sb_ans.append( s.substring(0, l-1) );
			sb_ans.append(sb_reverse.toString());
			sb_ans.append(s.substring(r,s.length()));
					
			System.out.println(sb_ans.toString());
			

		}
	}

}