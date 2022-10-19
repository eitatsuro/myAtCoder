package abc;

import java.util.Scanner;

public class ABC_273_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long x = sc.nextLong();
			int k = sc.nextInt();
			
			long ans = x;
			for (int i=0; i<k; i++) {
				long temp = ans % (long) Math.pow(10, i+1);
				if ( temp >= 5*Math.pow(10, i)) {
					ans = ans -temp + (long) Math.pow(10, i+1);
				} else {
					ans = ans -temp;
				}
			}
			
			System.out.println(ans);
			
			
		}
	}

}