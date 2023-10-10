import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		ArrayGenerator arrayGenerator = new ArrayGenerator();
		Integer[][] integers = arrayGenerator.generateArrays(10);
		for (Integer[] a:
			 integers) {
			System.out.println(Arrays.toString(a));
		}
	}
}
