package abc;

import java.util.Scanner;

public class ABC_267_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] A = new int[N];
			for(int i=0; i<N; i++) {
				A[i] = sc.nextInt();
			}

			long sum_max=0;
			long sum = 0;
			long sum_partnum = 0;
			for (int i=0; i+M < N; i++ ) {

				if(i==0) {
					for (int j=i; j-i<=M; j++ ) {
						sum += A[j]*(j-i+1);
						sum_partnum += A[j];
					}
					sum_max = sum;
				} else {
					sum = sum + M*A[M+i-1] - sum_partnum;
					sum_partnum = sum_partnum - A[i-1] + A[M+i-1];
				}
								
				if (sum_max < sum) {
					sum_max = sum;
				}
			}
			System.out.print(sum_max);
			
		}

	}
}