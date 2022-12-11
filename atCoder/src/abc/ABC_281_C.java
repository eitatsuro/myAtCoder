package abc;

import java.util.Scanner;

public class ABC_281_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			long T = sc.nextLong();
			int[] A = new int[N];
			long[] A_startTime = new long[N+1];
			
			long totalTime=0;
			for(int i=0; i<N; i++) {
				A[i] = sc.nextInt();
				A_startTime[i] = totalTime;
				totalTime+=A[i];
			}
			A_startTime[N] = totalTime;
			
			long lastPlayTime = T%totalTime;
			
			int min=0;
			int max=N-1;
			int candidate = (min+max)/2;
			boolean isRoughSearch = true;
			while( min != max) {
				if ( A_startTime[candidate] < lastPlayTime) {
					if ( lastPlayTime < A_startTime[candidate+1]  ) {
						break;
					}
					if(isRoughSearch) min = candidate;
				} else {
					if(isRoughSearch) max = candidate;
				}
				
				if ( max - min > 100) {
					candidate = (min+max)/2;
				} else {
					if (isRoughSearch) {
						isRoughSearch = false;
						candidate = min;
					} else {
						candidate++;
					}
				}
			}
			
			System.out.print(candidate+1 + " " + (lastPlayTime - A_startTime[candidate]));
		}
	}
}