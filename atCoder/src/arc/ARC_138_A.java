package arc;

import java.util.Arrays;
import java.util.Scanner;

public class ARC_138_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int N = sc.nextInt();
			int K = sc.nextInt();
			int[] a = new int[N];
			
			for(int i=0; i<N; i++) {
				a[i] = sc.nextInt();
			}

			//部分列に分ける
			int[] a_score = new int[K];
			int[] a_nonescore = new int[(N-K)];

			for(int i=0; i<K; i++) {
				a_score[i] = a[i];
			}

			for(int i=K; i<N; i++) {
				a_nonescore[i-K] = a[i];
			}
			
			//入れ替え対象箇所をメモする
			int[] targetCandidate = new int[K];
			//入れ替え対象を探索する
			for (int i=0; i<K; i++) {
				for (int j=0; j<N-K; j++) {
					if(a_score[i] < a_nonescore[j] ) {
						targetCandidate[i] = j;
						break;
					}
				}
			}
			
			int[] kaisu = new int[K];
			// 入れ替え対象箇所からそれぞれの回数を計算
			for (int i=0; i<K; i++) {
				kaisu[i] = K + targetCandidate[i] - i;
			}
			
			Arrays.sort(kaisu);
			Arrays.sort(a_score);
			Arrays.sort(a_nonescore);
			
			int min_a_score = a_score[0];
			int max_a_nonescore = a_nonescore[(N-K-1)];
			
			if ( min_a_score >= max_a_nonescore){
				System.out.println(-1);
				System.exit(0);
			} 
			
			System.out.println(kaisu[0]);
			
		}
	}
	
	/**
	 * 
	 * @param a
	 * @param k
	 * @return
	 */
	static int getScore(int[] a, int k ) {
		int score = 0;
		for (int i=0; i<k; i++) {
			score += a[i];
		}
		return score;
	}


	//最大公約数gcd ( Greatest Common Divisor )
	static int gcd (int a, int b) {
		int temp;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return b;
	}



}