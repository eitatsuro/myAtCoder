package abc;

import java.util.Scanner;

public class ABC_281_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String S = sc.next();

			if(S.length() != 8) {
				System.out.println("No");
				System.exit(0);
			}


			if( S.charAt(0) < 'A' || S.charAt(0) > 'Z') {
				System.out.println("No");
				System.exit(0);				
			}

			int num = Integer.valueOf( S.substring(1, 7) );
			if( num < 100000 || num > 999999 ) {
				System.out.println("No");
				System.exit(0);				
			}

			if( S.charAt(7) < 'A' || S.charAt(7) > 'Z') {
				System.out.println("No");
				System.exit(0);				
			}


			System.out.println("Yes");

		}catch(Exception e){
			System.out.println("No");
			System.exit(0);			
		}
	}
}