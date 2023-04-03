package abc;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ABC_296_C2 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int X = sc.nextInt();
			Set<Integer> A = new HashSet<Integer>();

			for(int i=0; i<N; i++) {
				A.add(sc.nextInt());
			}


			for(Integer a: A) {
				if(  A.contains( Integer.valueOf(a+X) )) {
					System.out.println("Yes");
					System.exit(0);
				}
			}
			System.out.println("No");
		}
	}
}