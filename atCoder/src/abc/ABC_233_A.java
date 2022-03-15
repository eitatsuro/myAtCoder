package abc;

import java.util.Scanner;


public class ABC_233_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int ans = 0;
			while ( y > x + 10*ans ) {
				ans++;
			}
			
			System.out.println(ans);
			

		}
	}

}