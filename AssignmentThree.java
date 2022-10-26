public class AssignmentThree {
	public static void main(String[] args) {
		int row = 14;
		int column = 14;
		int middle = column / 2 - 1;
		int temp = 0;
		int spaceLoop[] = new int[column * 2];
		spaceLoop[temp++] = middle;
		boolean flag = false;
		int index = 1;
		for (int i = 0; i < row; i++) {
			if (i > 1) {
				spaceLoop[temp++] = middle - index;
				spaceLoop[temp++] = middle + index;
				index++;
			}
			for (int j = 0; j < column; j++) {
				if (i > 0 && i != row - 1 && j > 0 && j != column - 1) {
					for (int space = 0; space < column; space++) {
						if (spaceLoop[space] == j) {
							flag = true;
							break;
						} else
							flag = false;
					}
					if (flag)
						System.out.print(" ");
					else
						System.out.print("*");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
