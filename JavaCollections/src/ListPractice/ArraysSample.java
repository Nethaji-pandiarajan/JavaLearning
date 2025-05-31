package ListPractice;

import vo.StudentVO;

public class ArraysSample {

	public static void main(String[] args) {

	}

	public void printAnArray() {
		int[] a = { 0, 1, 2, 3, 4, 5, 6 };
		

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	public void storingObjects() {
		
		StudentVO a = new StudentVO();
		StudentVO b = new StudentVO();
		StudentVO c = new StudentVO();
		
		StudentVO[] studentArray = new StudentVO[5];
		
		studentArray[0] = a;
		studentArray[1] = b;
		studentArray[2] = c;
		
	}

}
