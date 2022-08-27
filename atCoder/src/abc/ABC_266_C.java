package abc;

import java.util.Scanner;

public class ABC_266_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int ax = sc.nextInt();
			int ay = sc.nextInt();
			int bx = sc.nextInt();
			int by = sc.nextInt();
			int cx = sc.nextInt();
			int cy = sc.nextInt();
			int dx = sc.nextInt();
			int dy = sc.nextInt();

			// 点Oを原点とした場合、
			// 角AOBは ax*by - ay*bx  <=0 だと180度以上となる.
			// 点Bを原点にする。角ABC,角BCD,角CDA,角DABについて
			if (        -(ax-bx)*(cy-by) + (ay-by)*(cx-bx) <=0
					||  -(bx-cx)*(dy-cy) + (by-cy)*(dx-cx) <=0 
					||  -(cx-dx)*(ay-dy) + (cy-dy)*(ax-dx) <=0 
					||  -(dx-ax)*(by-ay) + (dy-ay)*(bx-ax) <=0 ) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}

		}
	}

}