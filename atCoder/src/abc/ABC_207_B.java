package abc;

import java.util.Scanner;


public class ABC_207_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// �����̓���
			int a_blue = sc.nextInt(); //���F�{�[���i�����j
			int b_blue = sc.nextInt(); //���F�{�[��
			int c_red = sc.nextInt();  //�ԐF�{�[��
			int d = sc.nextInt(); //�ڕW�l (a_blue+b_blue*n) <= d*(c_red*n)

			// �B���s�\
			if ( b_blue >= c_red*d ) {
				System.out.println(-1);

			} else {

				//�J��Ԃ��� n >=1 
				int n = 1;
				while ( a_blue + (b_blue - d*c_red)*n > 0) {
					n++;
				}
				System.out.println(n);
			}

		}
	}
}
