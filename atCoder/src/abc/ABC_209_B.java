package abc;

import java.util.Scanner;


public class ABC_209_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();  // N ���i��
			int x = sc.nextInt();  // X ������
			int [] a = new int[n+1]; // ���i�̒l�i 

			for (int i=1; i<=n; i++) {
				if ( i%2 == 0 ) {
					a[i] = sc.nextInt() - 1; // �����ԖڂȂ��1�~����	
				} else {
					a[i] = sc.nextInt();
				}

			}

			int total_expense = 0;
			for(int temp : a) {
				total_expense += temp;
			}

			if ( total_expense <= x ) {
				System.out.println("Yes");				
			} else {
				System.out.println("No");
			}

		}
	}
}