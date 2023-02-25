package abc;

import java.util.Scanner;

public class ABC_287_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			
			int countFor = 0;
			for(int i=0; i<N; i++) {
				String temp = sc.next();
				if ( "For".equals(temp)) {
					countFor++;
				}
				
				if ( countFor > (N-1)/2 ) {
					System.out.println("Yes");
					System.exit(0);
				}
			}
			
			System.out.println("No");
		}
	}
}
