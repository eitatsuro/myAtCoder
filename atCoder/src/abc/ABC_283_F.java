package abc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ABC_283_F {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int[] P = new int[N];
			
			for(int i=0; i<N; i++) {
				P[i]=sc.nextInt();
			}
			
			//ans
			List<Integer> ansList = new ArrayList<Integer>();
			
			
			for(int i=1; i<=N; i++) {
				int min=200000;
				for(int j=i; j<=N; j++) {
					if(i != j ) {
						int temp = Math.abs(P[i-1] - P[j-1]) + Math.abs(i-j);
						if( min > temp ) min = temp;
					} else {
						// do nothing
					}
					
				}
				ansList.add(min);
			}
			
			
			for ( Integer temp : ansList) {
				System.out.print(temp+" ");
			}
			
			


		}
	}
}
