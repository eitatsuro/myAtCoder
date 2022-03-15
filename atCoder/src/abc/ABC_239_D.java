package abc;

import java.util.Scanner;

public class ABC_239_D {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();

			// 青木君が勝つ場合
			for  (int i=a; i<=b; i++) {
				for (int j=c; j<=d; j++) {
					if(isPrime(a));
				}
			}
			
			if ( isPrime(a+c) || isPrime(a+d) || isPrime(b+c) || isPrime(b+d) ) {
				System.out.println("Aoki");
			} else {
				System.out.println("Takahashi");
			}
			
			
			
		}
	}
	
	private static boolean isPrime(int targetNum) {
		boolean ans = true;
		//nを2からn-1までの全ての数字で割って、一度でも割り切れる数字があれば素数でない（judge=false）
		for(int i = 2; i < targetNum; i++) {
			if(targetNum%i == 0) {
				ans = false;
				break;
			}
		}
		return ans;

	}

}