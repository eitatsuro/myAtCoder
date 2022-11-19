package abc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ABC_278_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int Q = sc.nextInt();

			Map<Integer,Set<Integer>> followMap = new HashMap<Integer, Set<Integer>>();

			for (int i=0; i<Q; i++) {
				int T = sc.nextInt();
				int A = sc.nextInt();
				int B = sc.nextInt();

				if ( T == 1 ) {
					if ( followMap.get(Integer.valueOf(A)) == null) {
						followMap.put(A, new HashSet<Integer>());
						followMap.get(A).add(B);
					} else {
						followMap.get(A).add(B);
					}
				} else if ( T == 2) {
					if ( followMap.get(Integer.valueOf(A)) == null) {
					} else {
						followMap.get(A).remove(B);
					}					
				} else {
					if ( followMap.get(Integer.valueOf(A)) == null
							|| followMap.get(Integer.valueOf(B)) == null ) {
						System.out.println("No");
					} else if ( followMap.get(Integer.valueOf(A)).contains(B) && followMap.get(Integer.valueOf(B)).contains(A)  ) {
						System.out.println("Yes");
					} else {
						System.out.println("No");
					}
				}		
			}
		}
	}
}