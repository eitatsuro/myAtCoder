package abc;

import java.util.Scanner;


public class ABC_212_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			String code = sc.next();

			// 4Œ…‚Æ‚à“¯‚¶”š‚©‚Ç‚¤‚©
			char firstDigit = code.charAt(0);
			boolean isAllSameDigits = true;
			for ( int i = 1; i < 4; i++ ) {
				if ( firstDigit != code.charAt(i) ) {
					isAllSameDigits = false;
				}
			}
			if (isAllSameDigits) {
				System.out.println("Weak");
				System.exit(0);
			}

			// ˜A”Ô‚©‚Ç‚¤‚©
			boolean isConsequence = true;
			for ( int i = 0; i < 3; i++ ) {
				if ( (Integer.parseInt(String.valueOf(code.charAt(i))) + 1)%10 != Integer.parseInt(String.valueOf(code.charAt(i+1)))) {
					isConsequence = false;
				}
			}
			if (isConsequence) {
				System.out.println("Weak");
				System.exit(0);
			}
			
			System.out.println("Strong");
			
			
		}
	}
}