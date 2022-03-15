package abc;

import java.util.Scanner;

public class ABC_087_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// �����̓���
			int a = sc.nextInt(); // 500�~�ʂ̖���
			int b = sc.nextInt(); // 100�~�ʂ̖���
			int c = sc.nextInt(); //  50�~�ʂ̖���
			int x = sc.nextInt(); // �x�������z
			
			// �x�����p�^�[��
			int combination = 0;
			
			// x    = 500*a + 100*b + 50*c
			// x/50 =  10*a +   2*b +    c  = Y  ( 1 <= Y <= 20000/50 = 400 ) 
			for ( int i = 0; i<=40; i++) {
				for ( int j = 0; j<=200; j++ ) {
					for ( int k = 0; k<=400; k++ ) {
						if ( 10*i + 2*j + k == x/50
								&& i <= a && j <= b && k <= c ) {
							combination++;
						}
					}
				}
			}

			System.out.println(combination);


		}
	}
}
