public class AssignmentOne {
	public static void usingArrayConcept(int[] rowToDisplay, int column) {
		boolean flag = false;
		for (int i = 0; i < rowToDisplay.length; i++) {
			if (column == rowToDisplay[i]) {
				System.out.print("*");
				flag = true;
				break;
			}
		}
		if (!flag)
			System.out.print(" ");
	}

	public static void main(String[] args) {
		int rowCount = 5;
		int columnCount = 35;
		int[] rowOne = { 0, 2, 6, 8, 9, 10, 11, 13, 17, 19, 20, 21, 22, 24, 25, 26, 27, 28, 30, 34 };
		int[] rowTwo = { 0, 2, 3, 6, 8, 13, 17, 19, 22, 24, 28, 30, 31, 34 };
		int[] rowThree = { 0, 2, 4, 6, 8, 9, 10, 11, 13, 17, 19, 20, 21, 22, 24, 28, 30, 32, 34 };
		int[] rowFour = { 0, 2, 5, 6, 8, 13, 17, 19, 21, 24, 28, 30, 33, 34 };
		int[] rowFive = { 0, 2, 6, 8, 9, 10, 11, 13, 14, 15, 16, 17, 19, 22, 24, 25, 26, 27, 28, 30, 34 };

		for (int row = 0; row < rowCount; row++) {
			for (int column = 0; column < columnCount; column++) {
				switch (row) {
				case 0:
					usingArrayConcept(rowOne, column);
					break;
				case 1:
					usingArrayConcept(rowTwo, column);
					break;
				case 2:
					usingArrayConcept(rowThree, column);
					break;
				case 3:
					usingArrayConcept(rowFour, column);
					break;
				case 4:
					usingArrayConcept(rowFive, column);
					break;
				}
			}
			System.out.println();
		}
	}

}
