package abc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ABC_276_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int N = sc.nextInt(); // 都市の数
			int M = sc.nextInt(); // 道路の数

			int[] A = new int[M];
			int[] B = new int[M];

			for(int i=0; i<M; i++) {
				A[i]=sc.nextInt();
				B[i]=sc.nextInt();
			}


			List<List<Integer>> answers = new ArrayList<List<Integer>>();
			for (int k=1; k<=N; k++) {
				answers.add(new ArrayList<Integer>());
			}


			for (int i=0; i<M; i++) {
				answers.get(A[i]-1).add(B[i]);
				answers.get(B[i]-1).add(A[i]);
			}

			for (int i=0; i<N; i++) {
				List<Integer> tempList = answers.get(i);
				tempList.sort(Comparator.naturalOrder());
				System.out.print(tempList.size());
				for (Integer temp : tempList) {
					System.out.print(" "+ temp);
				}					
				System.out.println();
			}
		}
	}
}