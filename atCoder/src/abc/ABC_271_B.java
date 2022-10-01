package abc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ABC_271_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int N = sc.nextInt();
			int Q = sc.nextInt();

			List<Integer> L = new ArrayList<Integer>();
			List<List<Integer>> a = new ArrayList<List<Integer>>();

			for (int i=0; i<N; i++) {
				int len = sc.nextInt();
				L.add(len);
				List<Integer> temp = new ArrayList<Integer>();
				for ( int j=0; j<len; j++) {
					temp.add(sc.nextInt());
				}
				a.add(temp);
			}

			for (int i=0; i<Q; i++) {
				int s = sc.nextInt();
				int t = sc.nextInt();

				System.out.println(a.get(s-1).get(t-1));

			}
		}
	}



}