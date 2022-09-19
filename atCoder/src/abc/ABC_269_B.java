package abc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ABC_269_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			
			List<String> stringList = new ArrayList<String>();
					
			for (int i=0; i<10; i++) {
				stringList.add(sc.next());
			}

			int a=0;
			int b=0;
			int c=0;
			int d=0;
			for(int i=0; i<stringList.size(); i++) {
				if ( stringList.get(i).contains("#")) {
					if (a ==0 ) a = i+1;
					if (c == 0) c = stringList.get(i).indexOf("#")+1;
					if (d == 0) d = stringList.get(i).lastIndexOf("#")+1;
				} else {
					if (a != 0 && b == 0) b = i;
				}
			}
			
			if (b==0) b=10;
			
			System.out.println(a+" "+b);
			System.out.println(c+" "+d);
			

		}
	}

}