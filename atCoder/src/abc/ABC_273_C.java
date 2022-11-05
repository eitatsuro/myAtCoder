package abc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ABC_273_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			Long[] A = new Long[N];

			for(int i=0; i<N; i++) {
				A[i] = sc.nextLong();
			}

			Arrays.sort(A);
			List<Long> A_list = new ArrayList<Long>(Arrays.asList(A));

			for (int k=0; k<N; k++) {

				int size = A_list.size();
				int ans = 0;
				for ( int j=size-1; j>=0; j-- ) {
					if (A_list.get(j) == A_list.get(size-1)) {
						ans++;
					}
				}
				System.out.println(ans);

				for ( int j=size-1; j>size-1-ans && j>=0 ; j-- ) {
					A_list.remove(j);

				}
			}
		}
	}
}