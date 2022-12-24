package abc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ABC_282_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int M = sc.nextInt();

			List<String> S = new ArrayList<String>();
			for (int i=0; i<N; i++) {
				S.add(sc.next());
			}

			int numOfCombination=0;
			for (int i=0; i<N; i++) {
				for (int j=i+1; j<N; j++) {
					for (int k=0; k<M; k++) {
						if(	S.get(i).charAt(k) == 'o' || S.get(j).charAt(k) == 'o') {
							if ( k == M-1) numOfCombination++;
							continue;
						} else {
							break;
						}
					}
				}
			}

			System.out.println(numOfCombination);


		}
	}
}
