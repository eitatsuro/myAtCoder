package abc;

import java.util.Arrays;
import java.util.Scanner;


public class ABC_209_C {
	static final int prime_number = 1000000007;
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();  // N ����̒���
			int [] c = new int[n]; // ���� C 

			// ����C�̓���
			for (int i=0; i<n; i++) {
				c[i] = sc.nextInt();
			}

			// ������v�Z����
			// ����Ōv�Z����ƁA�u����c�������łȂ��ł���Ƃ��v���L�̌v�Z���ƂȂ�
			// c[0]*(c[1]-1)*(c[2]-2)*(c[3]-3)*....
			// �\�[�g���� 
			Arrays.sort(c);

			long ans = 1;
			for (int i=0; i<n; i++) {
				if ( c[i] - i < 1) {
					ans = 0;
					break;
				}
				ans = ans * (c[i] - i);
				ans = ans % prime_number;
			}
			System.out.println(ans);
		}
	}
}