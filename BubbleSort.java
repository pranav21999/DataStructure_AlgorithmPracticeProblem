package algorithm;

public class BubbleSort {
	//Main method
	public static void main(String[] args) {

		int[] arr = { 36, 89, 45, 77, 63, 32 };

		System.out.println("Arry Before Sorting:");
		bs.printArray(arr);
		BubbleSort bs = new BubbleSort();
		bs.bubbleSort(arr);
		System.out.println("\n");
		System.out.println("Sorted array");
		bs.printArray(arr);
	}
	// method of bubble sort
	public void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	// print method
	public void printArray(int[] arr) {
		for(int i=0; i < arr.length; i++){  
            System.out.print(arr[i] + "\t ");  
		}
	}

}
