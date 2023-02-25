package abc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ABC_288_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			List<String> S_list = new ArrayList<String>();

			for(int i=0; i<N; i++) {
				if( i < K) {
					S_list.add(sc.next());
				} else {
					continue;
				}
			}
			
			Collections.sort(S_list, Comparator.naturalOrder());
			
			for( String temp : S_list) {
				System.out.println(temp);
			}




		}
	}
}
