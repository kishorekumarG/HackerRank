import java.util.Scanner;

public class SubsequenceAgain {

	static boolean isCountOfChar(String s, char ch, int k) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ch)
				count++;
		}
		if (count >= k)
			return true;
		else
			return false;
	}

	static String subsequenceAgain(String s, int k) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < s.length(); i++){
			int count = 0;
			count = s.length() - s.replace(s.charAt(i)+"","").length();
			if(count >= k)
				result.append(s.charAt(i));
		}
//		for (int i = 0; i < s.length(); i++) {
//			if (isCountOfChar(s, s.charAt(i), k)) {
//				result.append(s.charAt(i));
//			}
//		}
		return result.toString();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int k = in.nextInt();
		String result = subsequenceAgain(s, k);
		System.out.println(result);
		in.close();
	}
}
