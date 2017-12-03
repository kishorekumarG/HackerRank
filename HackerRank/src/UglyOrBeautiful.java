import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UglyOrBeautiful {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int queries = input.nextInt();
		List<String> result = new ArrayList<String>();
		for (int i = 0; i < queries; i++) {
			int flag = 0;
			int numberOfElements = input.nextInt();
			int[] numberArray = new int[numberOfElements];
			for (int j = 0; j < numberOfElements; j++) {
				numberArray[j] = input.nextInt();
			}
			for (int j = 0; j < numberOfElements - 1; j++) {
				if (numberArray[j] == numberArray[j + 1]) {
					flag++;
				}
			}
			int sortChecker = 1;
			for (int j = 1; j < numberOfElements; j++) {
				if (numberArray[j - 1] > numberOfElements)
					flag++;
				if (numberArray[j - 1] < numberArray[j])
					sortChecker++;
			}
			if (flag == 0 && sortChecker != numberOfElements) {
				result.add("Beautiful");
			} else {
				result.add("Ugly");
			}
		}
		for (String resultStr : result) {
			System.out.println(resultStr);
		}
		input.close();
	}
}
