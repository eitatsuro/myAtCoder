package abc;

import java.util.Scanner;


public class ABC_229_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			long a = sc.nextLong();
			long b = sc.nextLong();
			
			long sho_a = a;
			long sho_b = b;
			long amari_a = 0;
			long amari_b = 0;
			
			while ( sho_a > 0 && sho_b > 0) {
				amari_a = sho_a%10;
				amari_b = sho_b%10;
				sho_a = sho_a/10;
				sho_b = sho_b/10;
				
				if ( amari_a + amari_b >= 10) {
					System.out.println("Hard");
					System.exit(0);
				}
				
			}
			System.out.println("Easy");
		}
	}

}