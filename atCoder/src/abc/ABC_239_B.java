package abc;

import java.util.Scanner;

public class ABC_239_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			long x = sc.nextLong();
			
			long ans=0;
			if (x >= 0 ) {
				ans = Math.floorDiv(x, 10); 
			} else {
				x = -x;
				ans = -1*Math.floorDiv(x, 10);
				if ( x%10 == 0) {
					// do nothing
				} else {
					ans -=1 ;
				}
			}
			System.out.println( ans );
		}
	}

}