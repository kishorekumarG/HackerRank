import java.util.Arrays;
import java.util.Scanner;

public class HelpCity {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int K = input.nextInt();
		int N = input.nextInt();
		if (1 <= K && K <= Math.pow(10, 12) && 1 <= N && N <= Math.pow(10, 5)) {
			int[] cities = new int[N];
			for (int i = 0; i < N; i++) {
				cities[i] = input.nextInt();
			}

			int max = 0;
			int result = -1;
			int[] sortedCities = Arrays.copyOf(cities, cities.length);
			Arrays.sort(sortedCities);
			for (int F : sortedCities) {
				int count = 0;
				max = 0;
				int tempMax = 0;
				int j = 0;
				for (int i = 0; i < cities.length; i++) {
					j = i;
					count = 0;
					tempMax = 0;
					while (count < F && j < cities.length) {
						tempMax = tempMax + cities[j];
						if (tempMax > max)
							max = tempMax;
						count++;
						j++;
					}
					if (j == cities.length)
						break;
				}
				if (max > K) {
					result = F;
					break;
				}
			}
			System.out.println(result);
			input.close();
		} else {
			System.out.println("Invalid Inputs.");
		}
	}
}