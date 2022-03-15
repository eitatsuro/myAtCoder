package abc;

import java.util.Scanner;

public class ABC_081_A {

	public static void main(String[] args) {
		try ( Scanner sc = new Scanner(System.in)) {
			//3Œ…‚Ì®”‚Ì“ü—Í
			String s = sc.next();

			int result = 0;
			for (int i=0; i<3; i++) {
				if (s.charAt(i) == '1') { 
					result++;
				}
			}
			System.out.println(result);
			
		}

	}

}
