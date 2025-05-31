
public class ArrayProgramming {

	public static void main(String[] args) {

		int array[] = { 14, 53, 7, 88, 63, 9, 12, 34, 3, 56, 78, 90 };
		// int array[] = { 10, 3, 5, 6, 20 };
//		findlargestNumberInArray(array);
//		findSmallestNumberInArray(array);
//		secondLargestNumUsingSingleLoop(array);
//		secondMinNumber(array);
//		tripletProduct(array);
//		consecutiveNumber();
//		moveZeroToEnd();
		reverseSize();
	}

	public static int findlargestNumberInArray(int arr[]) {
		int largest = 0;
		for (int i = 0; i < arr.length; i++) {
			if (largest < arr[i]) {
				largest = arr[i];
			}
		}
		System.out.println("Largest Number in the Array : " + largest);
		return largest;
	}

	public static int findSmallestNumberInArray(int arr[]) {
		int smallest = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (smallest > arr[i]) {
				smallest = arr[i];
			}
		}
		System.out.println("Smallest Number in an array : " + smallest);

		return smallest;
	}

	public static int secondLargestNumber(int arr[]) {

		int second = 0;
		int largest = 0;

		for (int i = 0; i < arr.length; i++) {
			if (largest < arr[i]) {
				largest = arr[i];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (second < arr[i] && arr[i] != largest) {
				second = arr[i];
			}
		}

		System.out.println("Second Largest Number" + second);

		return second;
	}

	public static int secondLargestNumUsingSingleLoop(int arr[]) {

		int second = Integer.MIN_VALUE;
		int first = Integer.MIN_VALUE;
		for (int num : arr) {
			if (num > first) {
				second = first;
				first = num;
			} else if (num > second && num != first) {
				second = num;
			}
		}

		if (second == Integer.MIN_VALUE) {
			System.out.println("Second Largest Value is not present");
		} else {
			System.out.println("Second Largest Value is : " + second);
		}

		return second;

	}

	public static int secondMinNumber(int a[]) {

		int secondMin = Integer.MAX_VALUE;
		int firstMin = Integer.MAX_VALUE;
		for (int num : a) {
			if (num < firstMin) {
				secondMin = firstMin;
				firstMin = num;
			} else if (num < secondMin && firstMin != num) {
				secondMin = num;
			}
		}

		System.out.println(secondMin);
		return secondMin;
	}

	public static int tripletProduct(int a[]) {

		int maxOutput = Integer.MIN_VALUE;

		int n = a.length;

		if (n < 3) {
			return -1;
		}

		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = i + 2; k < n; k++) {
					maxOutput = Math.max(maxOutput, a[i] * a[j] * a[k]);
				}
			}
		}

		System.out.println("Triplet" + maxOutput);

		return maxOutput;
	}

	// Maximum consecutive one’s (or zeros) in a binary array
	public static void consecutiveNumber() {

		int count = 0;
		int countofZero = 0;
		int a[] = { 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0 };
		int consecutive = 0;
		int consecutiveOfZero = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1) {
				countofZero = 0;
				count++;
				consecutive = Math.max(consecutive, count);
			} else if (a[i] == 0) {
				count = 0;
				countofZero++;
				consecutiveOfZero = Math.max(consecutiveOfZero, countofZero);
			}

		}

		System.out.println("Consecutive Number: " + consecutive);
		System.out.println("Consecutive of O :" + consecutiveOfZero);

	}

	// Move all zeros to end of array
	public static void moveZeroToEnd() {

		int a[] = { 1, 3, 0, 0, 0, 6, 8 };

		int temp[] = new int[a.length];
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				temp[j++] = a[i];
			}
		}

		while (j < a.length) {
			temp[j++] = 0;
		}

		// Copy all the elements from temp[] to arr[]
		for (int i = 0; i < a.length; i++) {
			a[i] = temp[i];
			System.out.print(a[i] + " ");
		}

//        Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8, 9], K = 3 

	}

	// Reverse an Array in groups of given size
	public static void reverseSize() {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int k = 3;
		int n = a.length;
		int temp[] = new int[n];
		int index =0;
		for(int i = 0;i<n; i +=k) {
			int left = Math.min(i+k-1, n-1);
			for(int j=left;j>=i;j--) {
				temp[index++] = a[j];
			}
		}
		
		for (int num : temp) {
			System.out.print(num +" ");
		}

	}

	
}
