package abc;

import java.util.Scanner;
import java.util.regex.Pattern;


public class ABC_211_C {
	static final int prime_number = 1000000007;
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			String s = sc.next(); // •¶š—ñS (all lower case)

			// chokudai‚ğ\¬‚·‚é—v‘f‚¾‚¯‚Ì•¶š—ñ‚É•ÏŠ·‚·‚é
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<s.length(); i++) {
				switch ( s.charAt(i) ) {
				case 'c':
				case 'h':
				case 'o':
				case 'k':
				case 'u':
				case 'd':
				case 'a':
				case 'i':
					sb.append(s.charAt(i));
					break;
				default:
					break;
				}
			}
			String chokudai = sb.toString();
			
			// ˆê‚Â‚à‘¶İ‚µ‚È‚¢ê‡
			Pattern pattern = Pattern.compile(".*c.*h.*o.*k.*u.*d.*a.*i.*");
			if ( !pattern.matcher(chokudai).find() ) {
				System.out.println("0");
			}

			
		}
	}
}