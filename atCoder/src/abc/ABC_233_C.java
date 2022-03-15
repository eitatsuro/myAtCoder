package abc;

import java.util.ArrayList;
import java.util.Scanner;


public class ABC_233_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

		int n = sc.nextInt();
		long x = sc.nextLong();
		
		int[] l = new int[n];
		ArrayList<ArrayList<Long>> list  = new ArrayList<ArrayList<Long>>();
		
		for (int i=0; i<n; i++) {
			l[i] = sc.nextInt();
			ArrayList<Long> arrayList = new ArrayList<>();
			for (int j=0; j<l[i]; j++ ) {
				arrayList.add(sc.nextLong());
			}
			list.add(arrayList);
		}
			

		}
	}

}