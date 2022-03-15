package abc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ABC_241_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt(); // n x n �s��
			List<String> s = new ArrayList<String>();
			
			for (int i=0; i<n; i++) {
				s.add(sc.next());
			}
			
			// 2�����z��ɕϊ�
			char[][] a  = new char[n][];	
			for (int i=0; i<n; i++) {
				a[i] = new char[n];
			}
			
			for (int i=0; i<n; i++) {
				for (int j=0; j<n; j++) {
					a[i][j] = s.get(i).charAt(j);					
				}
			}

			boolean finalAnswer = false;
			
			// ����6�Ȃ��ł��邩���ׂČ��ʂ�Ԃ�
			if (is6BlackInConsequence(s)) {
				finalAnswer = true;
			}
			
			
			
			
		}
	}
	
	private static boolean is6BlackInConsequence ( char[][] input, int n ) {
		boolean finalAnswer = false;
		List<String> list = new ArrayList<String>();
		
		// ����6�Ȃ��ł��邩���ׂ�
		for (int i=0; i<n; i++) {
			list.add(String.valueOf(input[i]));
		}
		finalAnswer = is6BlackInConsequence(list); // ��6�̌���
		
		// �c��6�Ȃ��ł��邩���ׂ�
		
		// 2�����z��ɕϊ�����̂ŕϊ���̔z��𐶐�
		char[][] b  = new char[n][];	
		for (int i=0; i<n; i++) {
			b[i] = new char[n];
		}

		// �]�u
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				b[i][j] = input[j][i];					
			}
		}

		for (int i=0; i<n; i++) {
			list.add(String.valueOf(b[i]));
		}
		finalAnswer = is6BlackInConsequence(list); // �c6�̌���
		
		
		
		return finalAnswer;
		
		
		
		
		
	}
	
	
	private static boolean is6BlackInConsequence ( List<String> input ) {
		
		boolean ans = false;
		for (String temp : input) {
			if (temp.contains("######")) {
				ans = true;
			}
		}
		
		return ans;
	}

}