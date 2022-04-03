package typical90;

import java.util.Arrays;
import java.util.Scanner;

public class Typical90_a_BinarySearch {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			// 探す範囲
			int[] a = {35, 34, 55, 66,99, 103, 434, 35, 33, 50 };
			Arrays.sort(a);
			
			// 探索対象（昇順）
			System.out.println("探索対象（昇順）");
			System.out.println(Arrays.toString(a));

			// 探索対象
			int target = sc.nextInt();

			// Binary Search
			// 探索範囲 L, R
			int L = 0;
			int R = a.length;

			while ( L < R ) {
				int mid = (L+R)/2;
				if ( a[mid] == target ) {
					mid++;
					System.out.println( target+"は"+mid+"番目.");
					System.exit(0);
				} else if ( target < a[mid]) {
					R = mid;
				} else {
					L = mid;
				}
			}
			
			System.out.println("targetはありませんでした");

		}
	}

}
