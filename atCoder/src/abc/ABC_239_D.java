package abc;

import java.util.Scanner;

public class ABC_239_D {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();

			// �،N�����ꍇ
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
		//n��2����n-1�܂ł̑S�Ă̐����Ŋ����āA��x�ł�����؂�鐔��������Αf���łȂ��ijudge=false�j
		for(int i = 2; i < targetNum; i++) {
			if(targetNum%i == 0) {
				ans = false;
				break;
			}
		}
		return ans;

	}

}