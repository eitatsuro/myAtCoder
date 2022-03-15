package abc;

import java.util.HashSet;
import java.util.Scanner;


public class ABC_211_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			HashSet<String> targetSet = new HashSet<String>();
			targetSet.add("H");
			targetSet.add("2B");
			targetSet.add("3B");
			targetSet.add("HR");

			String s1 = sc.next();
			String s2 = sc.next();
			String s3 = sc.next();
			String s4 = sc.next();

			HashSet<String> set = new HashSet<String>();
			set.add(s1);
			set.add(s2);
			set.add(s3);
			set.add(s4);



			if ( set.containsAll(targetSet)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		}
	}
}