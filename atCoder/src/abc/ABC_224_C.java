package abc;

import java.util.Scanner;


public class ABC_224_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt(); // �_�̌�
			long[] x = new long[n];
			long[] y = new long[n];

			// �_i�̍��W���擾
			for(int i=0; i<n; i++) {
				x[i] = sc.nextLong();
				y[i] = sc.nextLong();
			}

			int answer = 0;

			// 3�_�I�񂾎���3�p�`�ƂȂ����
			// => �C�ӂ�2�_�����Ԓ�����ɁA�c��1�_�����݂��Ȃ�.
			for (int i=0; i<n-2; i++) {
				for (int j=i+1; j<n-1; j++) {
					for (int k=j+1; k<n; k++) {
						// �ȉ��̏����𖞂����ƈ꒼���ɑ��݂��邽�߂m�f
						// ���̐�����3�_�͂��ׂĂ��ƂȂ���W�ƂȂ��Ă���̂ł��ꂪ�R�p�`���ł��Ȃ�����
						//							if ( x[i] != x[j] && y[k]*(x[j]-x[i]) == (y[j]-y[i])*x[k] + y[i]*(x[j]-x[i]) - x[i] ) {
						//								// do nothing.
						//							} else if ( x[i] == x[j] && x[j] == x[k] ) {
						//								// do nothing.
						//							} else if ( y[i] == y[j] && y[j] == y[k] ) {
						//								// do nothing.
						//							} else if ( x[i] != x[j] && y[k]*(x[j]-x[i]) == x[k]*(y[j]-y[i]) ) {
						//								// do nothing.
						if ( y[k]*(x[j]-x[i]) == (y[j]-y[i])*x[k] + y[i]*(x[j]-x[i]) - x[i]*(y[j]-y[i]) ) {
							// do nothing.
						} else if ( x[i] == x[j] && x[j] == x[k] ) {
							// do nothing
						} else { 
							answer++;
						}
					}
				}
			}
			System.out.println(answer);


		}
	}
}