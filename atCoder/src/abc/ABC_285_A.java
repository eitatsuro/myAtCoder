package abc;

import java.util.LinkedList;
import java.util.Scanner;

public class ABC_285_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int P = sc.nextInt()-1;
			int Q = sc.nextInt()-1;
			int R = sc.nextInt()-1;
			int S = sc.nextInt()-1;

			LinkedList<Integer> A = new LinkedList<Integer>();

			for(int i=0; i<N; i++) {
				A.add(sc.nextInt());
			}

			LinkedList<Integer> temp1 = new LinkedList<Integer>();
			LinkedList<Integer> temp2 = new LinkedList<Integer>();
			LinkedList<Integer> B = new LinkedList<Integer>();
			for(int i=0; i<N; i++) {
				if ( P <= i && i <= Q ) {
					temp1.add(A.get(i));
				} else if ( R<= i && i<=S ) {
					temp2.add(A.get(i));
				} else {
					B.add(A.get(i));
				}
			}
			

			B.addAll(P, temp2);
			B.addAll(R+temp2.size()-temp1.size(), temp1);
			
			for(Integer temp : B) {
				System.out.print(temp+" ");
			}

			

		}
	}
}
