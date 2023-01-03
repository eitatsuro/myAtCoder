package abc;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

/**
 * after_contest0*.txt が WAになる
 * @author eitatsuro
 *
 */
public class ABC_283_D {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String S = sc.next();
			List<String> hako_list = new ArrayList<String>();
			// スタック
			Deque<String> stack = new ArrayDeque<String>();

			int length = S.length();

			for (int i=0; i<length; i++ ) {
				// Hakoniireru
				if(S.charAt(i) >= 'a' && S.charAt(i) <= 'z') {
					if (hako_list.contains(String.valueOf( S.charAt(i)))) {
						// ki wo ushinau
						System.out.println("No");
						System.exit(0);
					} else {
						hako_list.add( String.valueOf( S.charAt(i)) );
						stack.push( String.valueOf( S.charAt(i)) );
					}
				} else if ( S.charAt(i) == '(' ) {
					// do nothing.
				} else {
					// in case of ')'
					while ( !stack.isEmpty()) {
						String target = stack.pop();
						if ( target != null ) {
							hako_list.remove( target );
						}
					}
				}
			}
			System.out.println("Yes");
		}
	}
}
