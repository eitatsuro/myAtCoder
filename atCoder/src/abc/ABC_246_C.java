package abc;

import java.util.Arrays;
import java.util.Scanner;

public class ABC_246_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
		
			int N = sc.nextInt(); // products
			int K = sc.nextInt(); // coupon
			int X = sc.nextInt(); //
			int[] A = new int[N]; // price of product for each
			int[] remains = new int[N];
			for (int i=0; i<N; i++) {
				A[i] = sc.nextInt(); 
				remains[i] = A[i];
			}

			int usedCoupon = 0;
			for (int i=0; i<N; i++) {
				int couponPerProduct = 0;
				couponPerProduct = (int) Math.floor(A[i]/X);
				if ( usedCoupon + couponPerProduct <= K ) {
					remains[i] = A[i] - couponPerProduct*X;
					usedCoupon+=couponPerProduct;
				} else {
					remains[i] = A[i] - (K-usedCoupon)*X;
					usedCoupon = K;
					break;
				}
			}
			
			// 余りのクーポンがある場合
			if (usedCoupon < K) {
				Arrays.sort(remains);
				for (int i=N-1; i >=0; i--) {
					if ( usedCoupon +1 <= K ) {
						remains[i] = 0;
						usedCoupon++;
					} else {
						break;
					}
				}
			}
			
			int answer = 0;
			for(int temp : remains) {
				answer+=temp;
			}
			
			System.out.println(answer);
			
			


		}

	}

}
