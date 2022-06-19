package abc;

import java.util.Scanner;

public class ABC_247_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String S = sc.next();
			
			StringBuilder sb = new StringBuilder();
			sb.append("0").append(S);
			sb.deleteCharAt(4);
			
			System.out.println(sb.toString());

		}

	}

}
