package abc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ABC_243_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			int [] a = new int[n];
			int [] b = new int[n];
			
			for (int i=0; i<n; i++) {
				a[i] = sc.nextInt();
			}

			for (int i=0; i<n; i++) {
				b[i] = sc.nextInt();
			}

			List<Integer> a_list = new ArrayList<Integer>();
			List<Integer> b_list = new ArrayList<Integer>();
			
			int ans1 = 0;
			for (int i=0; i<n; i++) {
				if ( a[i] == b[i]) {
					ans1++;
				} else {
					a_list.add(a[i]);
					b_list.add(b[i]);
				}
			}
			
			int ans2 = 0;
			for (Integer temp_a : a_list) {
				for (Integer temp_b : b_list) {
					if ( temp_a.intValue() == temp_b.intValue()) {
						ans2++;
						break;
					}
				}
			}
			
			System.out.println(ans1);
			System.out.println(ans2);
			
			
		}

	}

}
