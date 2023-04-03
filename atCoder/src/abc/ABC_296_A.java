package abc;

import java.util.Scanner;

public class ABC_296_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			String S = sc.next();

			char before=' ';
			for(int i=0; i<N; i++) {
				if(before == S.charAt(i)) {
					System.out.println("No");
					System.exit(0);
				} else {
					before = S.charAt(i);
					continue;
				}
			}
			System.out.println("Yes");
		}
	}
}
