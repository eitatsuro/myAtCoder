package abc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ABC_289_B_botsu2 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] a = new int[M];
			List<List<Integer>> listOfGraphList = new ArrayList<List<Integer>>();
			
			if(M==0) {
				for(int i=1;i<=N; i++) {
					System.out.print(i+" ");
				}
				System.exit(0);
			}
			
			// 連結されたグループの数を数える
			int numOfGroup = 0;
			for(int i=0; i<M; i++) {
				if(a[i] == a[i-1]-1) {
					// nothing.
				} else {
					numOfGroup++;
				}
			}
			
			
			int current = 0; //次にレ点を読む箇所
			boolean isConsecutive = false;
			for(int i=1; i<=N; i++) {
				if ( i != a[current]) {
					List<Integer> graphList = new ArrayList<Integer>();
					graphList.add(i);
				} else {
					current++;
					isConsecutive = true;
				}
			}
			
			
			for(int i=0; i<M; i++) {
				a[i] = sc.nextInt();
			}

			int current1 = 0;
			for(int i=0; i<M; i++) {
				if ( i != M-1 && a[i] == a[i+1] -1 ) {
					// do nothing.
				} else {
					List<Integer> graphList = new ArrayList<Integer>();
					if( i != M-1) {					
						for (int j=current1+1; j<=a[i]+1; j++ ) {
							graphList.add(j);
							current1 = j;
						}
					} else {
						for (int j=current1+1; j<=N; j++ ) {
							graphList.add(j);
							current1 = j;
						}
					}
					Collections.sort(graphList, Comparator.reverseOrder());
					listOfGraphList.add(graphList);
					

				}
			}
			
			for( List<Integer> tempList : listOfGraphList) {
				for(Integer tempInt : tempList) {
					System.out.print(tempInt+" ");
				}
			}

		}
	}
}
