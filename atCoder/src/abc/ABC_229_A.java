package abc;

import java.util.Scanner;


public class ABC_229_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			String s1 = sc.next();
			String s2 = sc.next();

			if (       s1.charAt(0) == '#' && s1.charAt(1) == '#'
					|| s1.charAt(0) == '#' && s2.charAt(0) == '#' 
					|| s1.charAt(1) == '#' && s2.charAt(1) == '#' 
					|| s2.charAt(0) == '#' && s2.charAt(1) == '#' ) {
				System.out.println("Yes");
			} else {
				System.out.println("No");	
			}



		}
	}

}