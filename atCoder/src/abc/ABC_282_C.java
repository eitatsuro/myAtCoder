package abc;

import java.util.Scanner;

public class ABC_282_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			String S = sc.next();

			StringBuilder sb = new StringBuilder();

			int length = S.length();
			boolean isReplace = true;
			for (int i=0; i<length; i++) {
				if (S.charAt(i) == '"') {
					isReplace = isReplace? false : true;
					sb.append(S.charAt(i));
				} else {
					if(isReplace && S.charAt(i)==',') {
						sb.append(".");
					} else {
						sb.append(S.charAt(i));
					}
				}				
			}

			System.out.println(sb.toString());


		}
	}
}
