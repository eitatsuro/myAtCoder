package abc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ABC_277_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			List<String> s_list = new ArrayList<String>();
			
			for (int i=0; i<N; i++) {
				s_list.add(sc.next());
			}
			
			// 条件１
			for ( String temp : s_list ) {
				if ( temp.startsWith("H") || temp.startsWith("D") || temp.startsWith("C") || temp.startsWith("S")) {
					continue;
				} else {
					System.out.println("No");
					System.exit(0);
				}
			}
			
			// 条件２
			for ( String temp : s_list ) {
				if (temp.matches(".{1}[ATJQK]") || temp.matches(".{1}[23456789]")) {
					continue;
				} else {
					System.out.println("No");
					System.exit(0);
				}
			}
			
			// 条件３
			Set<String> s_set = new HashSet<String>(s_list);
			if ( s_set.size() == s_list.size() ) {
				System.out.println("Yes");
			} else {
				System.out.println("No");		
			}
			
			System.exit(0);
			
		}
	}
}