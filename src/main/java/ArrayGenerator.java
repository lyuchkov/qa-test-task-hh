import java.util.*;

public class ArrayGenerator {
	public Integer[][] generateArrays(int n) {
		Integer [][] result = new Integer[n][];

		HashSet<Integer> sizes = new HashSet<>();

		Random random = new Random();

		for (int i = 0; i < n; i++) {
			int size = random.nextInt(n) + 1;
			
			if (sizes.contains(size)) {
				i--;
				continue;
			}

			sizes.add(size);

			result[i] = new Integer[size];
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] = random.nextInt(n*2);
			}
		}

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				Arrays.sort(result[i]);
			} else {
				Arrays.sort(result[i], Collections.reverseOrder());
			}
		}

		return result;
	}
}
