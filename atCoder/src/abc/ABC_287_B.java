package abc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ABC_287_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			List<String> S_list = new ArrayList<String>();
			List<String> T_list = new ArrayList<String>();
			
			for( int i=0; i<N; i++) {
				S_list.add(sc.next());
			}

			for( int i=0; i<M; i++) {
				T_list.add(sc.next());
			}

			int answer=0;
			for( String s_temp : S_list) {
				for ( String t_temp : T_list) {
					if( s_temp.endsWith(t_temp)) {
						answer++;
						break;
					}
				}
			}
			
			System.out.println(answer);
			
		}
	}
}
