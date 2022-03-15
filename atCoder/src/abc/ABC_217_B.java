package abc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ABC_217_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			List<String> all = new ArrayList<String>();
			all.add("ABC");
			all.add("ARC");
			all.add("AGC");
			all.add("AHC");

			all.remove(sc.next());
			all.remove(sc.next());
			all.remove(sc.next());
			
			for (String remains : all) {
				System.out.println(remains);
			}
			
		}
	}
}