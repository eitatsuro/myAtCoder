package abc;

import java.util.Scanner;

public class ABC_287_D {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String S = sc.next();
			String T = sc.next();
			
			StringBuilder sb = new StringBuilder();
			for ( int x=0; x <= T.length(); x++) {
				sb.delete(0, sb.length());
				sb.append(S.substring(0, x));
				sb.append(S.substring(S.length()-T.length()+x, S.length()));
//				String S_dash = S.substring(0, x).concat(S.substring(S.length()-T.length()+x, S.length()));
				if ( isMatch(sb.toString(), T)) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
				
			}


		}
	}

	private static boolean isMatch(String a, String b) {
		int length = a.length();
		if ( length != b.length())  return false;

		boolean answer = true;
		for ( int i=0; i<length; i++) {
			if(a.charAt(i) == b.charAt(i) 
					|| a.charAt(i) == '?'
					|| b.charAt(i) == '?') {
				// do nothing
			} else {
				answer = false;
				break;
			}
		}	
		return answer;
	}
}
