package abc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ABC_296_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			List<String> S_list = new ArrayList<String>();

			for(int i=0; i<8; i++) {
				S_list.add(sc.next());
			}

			int position_i = -1;
			int position_j = -1;
			for(int i=0; i<S_list.size(); i++) {
				String temp = S_list.get(i);
				for(int j=0; j<temp.length(); j++) {
					if (temp.charAt(j) == '*') {
						position_i = i;
						position_j = j;
					} else {
						continue;
					}
				}
			}

			String mapping_col = "abcdefgh";
			String mapping_row = "87654321";

			System.out.println(String.valueOf(mapping_col.charAt(position_j))
					+String.valueOf(mapping_row.charAt(position_i)));
		}
	}
}
