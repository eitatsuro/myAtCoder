package abc;

import java.util.Scanner;

public class ABC_086_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int N = sc.nextInt();
			int t = 0, x = 0, y = 0;
			int t_old = 0, x_old = 0, y_old = 0;

			for ( int i = 0; i < N; i++ ) {
				// ���̍��W���擾
				final int t_next = sc.nextInt();
				final int x_next = sc.nextInt();
				final int y_next = sc.nextInt();

				// ���W�ϊ��i�N�_��0�ɕύX
				t = t_next - t_old;
				x = x_next - x_old;
				y = y_next - y_old;

				// �ړ��۔���
				// 1�����̐���ł̈ړ��ɖ���u��������
				int distance = Math.abs(x) + Math.abs(y);
				// t�̊ԂɈړ��ł��鋗����t�ł��邽�߁A
				// distance > t �Ȃ�Ύw�莞�ԓ��ɓ��B�s�\.
				// distance = t �Ȃ�Γ��B�\
				// distance < t �̏ꍇ�͓��B�\������
				// ���̏ꍇ�it - distance > 0 �̏ꍇ�j�A
				// ( t - distance ) �������ł���΁A�]�������Ԃ������ړ����Ďw��̈ʒu�ɖ߂��.
				if ( t - distance >= 0 && ( t - distance )%2 == 0 ) {
					// �󂯎�����_�ɂ��Ă͓��B�\�Ȃ̂ŁA���̍��W���擾
					// ���݂̈ʒu��ۑ�
					t_old = t_next;
					x_old = x_next;
					y_old = y_next;
					continue;
				} else {
					System.out.println("No");
					return;
				}
			}

			// ���ׂĂ̓_�ɂ���No�łȂ���΁A���B�\
			System.out.println("Yes");


		}
	}
}
