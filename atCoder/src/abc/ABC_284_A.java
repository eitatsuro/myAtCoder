package abc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ABC_284_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			
			List<String> S_list = new ArrayList<String>();
			
			for( int i=0; i<N; i++) {
				S_list.add(sc.next());				
			}

			for( int i=N-1; i>=0; i--) {
				System.out.println(S_list.get(i));				
			}
		}
	}
}
