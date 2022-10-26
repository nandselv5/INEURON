public class AssignmentFive {

	public static void main(String[] args) {
		int row = 14;
		int column = 14;
		int rowSpace = column / 2 - 1;
		int middle = rowSpace;
		int starRange = column;
		int[] Space = new int[row * 2];
		int temp = 0;
		for (int i = 0; i < column; i++) {
			if (i > 0 && i <= middle)
				starRange = rowSpace--;
			if (rowSpace == 0)
				rowSpace = 2;
			else if (i > middle && i < row) {
				starRange = rowSpace++;
			}
			for (int j = 0; j < column; j++) {
				if (j < starRange || i == row - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
