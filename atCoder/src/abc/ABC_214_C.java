package abc;

import java.util.Scanner;


public class ABC_214_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt(); // �ʂ����N�̐�
			int[] s = new int[n]; // i�Ԗڂ̐l�����̐l�ɕ�΂�n���̂ɂ����鎞��
			int[] t = new int[n]; // i�Ԗڂ̐l����΂����炤����

			int[] shortestCandidate = new int[n];
			
			for ( int i = 0; i < n; i++) {
				shortestCandidate[i] = t[i];
			}
			
			
		}
	}
}