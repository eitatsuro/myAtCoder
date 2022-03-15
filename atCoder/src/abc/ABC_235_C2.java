package abc;

import java.util.Arrays;
import java.util.Scanner;

public class ABC_235_C2 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int q = sc.nextInt();
			int[] a = new int[n];
			int[] x = new int[q];
			int[] k = new int[q];

			for (int i=0; i<n; i++) {
				a[i] = sc.nextInt();
			}
			
			for (int i=0; i<q; i++) {
				x[i] = sc.nextInt();
				k[i] = sc.nextInt();
			}
			
			int[] ans = new int[q];
			for (int i=0; i<q; i++) {
				ans[i] = -1;
			}
			
			int[] x_sort = Arrays.copyOf(x, q);
			Arrays.sort(x_sort);
			
			
			for (int i=0; i<q; i++) {
				int shutugenkaisu = 0;
				if (search(a, x_sort[i]) == -1) {
					ans[i] = -1;
					continue;
				}
				for (int j=0; j<n; j++) {
					if ( a[j] == x[i] ) {
						shutugenkaisu++;
						if (shutugenkaisu == k[i]) {
							ans[i] = j+1;
							break;
						}
					}
				}
				
			}
			
			for (int temp : ans ) {
				System.out.println( temp );
			}
			
		}
	}
	
	public static int search(int[] data, int target) {
		int ret = -1;
		int left = 0;
		int right = data.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (data[mid] == target) {
				return mid + 1;
			} else if (target < data[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return ret;
	}

}