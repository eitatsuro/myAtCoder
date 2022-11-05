package abc;

import java.util.Scanner;

public class ABC_274_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			int seisu_bu = B/A;
			float shosu_bu = seisu_bu == 1 ? 0 : (float)B/(float)A;
			int shosubu_ans = (int) (shosu_bu*10000);
			
			
			if (shosubu_ans % 10 < 5) {
				// do nothing
			} else {
				shosubu_ans = shosubu_ans + 10;
			}
			
			shosubu_ans = shosubu_ans/10;
			String shosubu_ans_string = shosubu_ans == 0 ? "000" : String.valueOf(shosubu_ans);
					
			System.out.println(seisu_bu + "." + shosubu_ans_string );
			
		}
	}

}