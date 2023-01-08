package abc;

import java.util.Scanner;

public class ABC_284_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int T = sc.nextInt();

			for(int i=0; i<T; i++) {
				int N = sc.nextInt();
				int ans = 0;
				for( int j=0; j<N; j++) {
					if( sc.nextInt() % 2 != 0) ans++;
				}
				System.out.println(ans);
			}



		}
	}
}
