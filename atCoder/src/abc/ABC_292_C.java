package abc;

import java.util.Scanner;

public class ABC_292_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			
			boolean[] temp = getPrimesByEratosthenes(n);
			for(int i=0; i<=n; i++) {
				if(temp[i]) System.out.println(i);
			}
		}
	}
	
	/**
	 * エラトステネスの篩（ふるい）
	 * 
	 * 1 - N の中から素数を探す.
	 */
	private static boolean[] getPrimesByEratosthenes(int n){
		
		boolean[] isPrime = new boolean[n+1];
		for(int i=0; i<n+1; i++) {
			isPrime[i]=true;
		}
		
		isPrime[0]=false;
		isPrime[1]=false;
		
		// ふるいにかける
		for( int p=2; p<=n; p++) {
			// 素数候補でない（素数ラベルがOFFならば）スキップ
			if(!isPrime[p]) continue;
			
			// p以外のpの倍数について素数ラベルをOFF
			for( int q=p*2; q<=n; q+=p) {
				isPrime[q]=false;
			}
		}
		return isPrime;
	}
	
	
}
