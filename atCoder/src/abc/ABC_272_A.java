package abc;

import java.util.Scanner;

public class ABC_272_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();

			int ans = 0;
			for (int i=0; i<N; i++) {
				ans += sc.nextInt(); 
			}

			System.out.print(ans);

		}
	}
}