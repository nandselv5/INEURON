public class AssignmentFour {

	public static void main(String[] args) {
		int row = 8;
		int column = 14;
		int rowSpace = 1;
		int columnSpace = 1;
		boolean flag = false;
		int[] Space = new int[row * 2];
		int temp = 0;
		for (int i = 0; i < row; i++) {
			Space[temp] = i;
			Space[++temp] = column - 1 - i;
			temp++;
			for (int j = 0; j < column; j++) {
				for (int k = 0; k < Space.length; k++) {
					if (Space[k] == j) {
						flag = true;
						break;
					} else
						flag = false;
				}
				if (flag)
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();
		}
	}

}
