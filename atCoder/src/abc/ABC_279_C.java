package abc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ABC_279_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			
			List<String> sList = new ArrayList<String>();
			List<String> tList = new ArrayList<String>();
			
			for (int i=0; i<H; i++) {
				sList.add(sc.next());
			}
			for (int i=0; i<H; i++) {
				tList.add(sc.next());
			}
			
			List<String> sList_column = new ArrayList<>();
			List<String> tList_column = new ArrayList<>();
			
			StringBuilder sb_s = new StringBuilder();
			StringBuilder sb_t = new StringBuilder();
			for ( int j=0; j<W; j++  ) {
				sb_s.delete(0, sb_s.length());
				sb_t.delete(0, sb_t.length());
				for ( int i=0; i<H; i++) {
					sb_s.append(sList.get(i).charAt(j));
					sb_t.append(tList.get(i).charAt(j));
				}
				sList_column.add(sb_s.toString());
				tList_column.add(sb_t.toString());
			}
			Collections.sort(sList_column);
			Collections.sort(tList_column);
			
			if ( sList_column.equals(tList_column) ) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			

		}
	}
}