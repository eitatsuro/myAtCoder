package abc;

import java.util.*;
public class Main {
	public static void main(String[] args){
		try (Scanner sc = new Scanner(System.in)) {
			// �����̓���
			int a = sc.nextInt();
			// �X�y�[�X��؂�̐����̓���
			int b = sc.nextInt();
			int c = sc.nextInt();
			// ������̓���
			String s = sc.next();
			// �o��
			System.out.println((a+b+c) + " " + s);
		}
	}
}