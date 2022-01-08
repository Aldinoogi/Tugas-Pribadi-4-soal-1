
public class HalfPyramidofStarsPattern {
	public static void main (String[]args) {
		int row;
		int max_row = 5;
		int star;

		for (row = 1; row <= max_row; row++) {
			for (star = 1; star<=row; star++) {
				System.out.print ("* ");
			}

			System.out.println();
		}
	}
}