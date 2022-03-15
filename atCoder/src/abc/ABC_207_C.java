package abc;

import java.util.Scanner;


public class ABC_207_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// �����̓���
			int N = sc.nextInt(); // ��Ԃ̌�
			final int[] t = new int[N];
			final double[] l = new double[N];
			final double[] r = new double[N];
			
			for(int i=0; i<N; i++) {
				t[i] = sc.nextInt();
				
				// ��Ԃ̂ݍl���Ă������͕ς��Ȃ�
				switch (t[i]) {
				case 1:
					l[i] = sc.nextDouble();
					r[i] = sc.nextDouble();
					break;
				case 2:
					l[i] = sc.nextDouble();
					r[i] = sc.nextDouble() - 0.5;
					break;
				case 3:
					l[i] = sc.nextDouble() + 0.5;
					r[i] = sc.nextDouble();
					break;
				case 4:
					l[i] = sc.nextDouble() + 0.5;
					r[i] = sc.nextDouble() - 0.5;
					break;
				default:
					throw new IllegalArgumentException("Unexpected value: " + t[i]);
				}
			}

			// ���ʋ�Ԕ��� 
			int num_common=0;
			for (int i=0; i<N; i++) {
				for ( int j=i+1; j<N; j++) {
					if ( Math.max( l[i] , l[j] ) <= Math.min( r[i], r[j]) ) {
						num_common++;
					}
				}
			}
			
			System.out.println(num_common);

		}
	}
}
