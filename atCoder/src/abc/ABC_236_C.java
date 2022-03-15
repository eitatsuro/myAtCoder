package abc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ABC_236_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			int m = sc.nextInt();

			List<String> s = new ArrayList<String>();
			Set<String> t = new HashSet<String>();
	

			for (int i=0; i<n; i++) {
				s.add(sc.next());
			}

			for (int i=0; i<m; i++) {
				t.add(sc.next());
			}

			for (String temp : s) {
				if (t.contains(temp)) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}

		}
	}

}