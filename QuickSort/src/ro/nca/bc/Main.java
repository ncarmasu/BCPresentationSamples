package ro.nca.bc;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int arr[] = { 10, 7, 8, 9, 1, 5 };

	QuickSort2 ob = new QuickSort2(arr);
	ob.sort();

	System.out.println("sorted array: " + Arrays.toString(arr));
    }
}
