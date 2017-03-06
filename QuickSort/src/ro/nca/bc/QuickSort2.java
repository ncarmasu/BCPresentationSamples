package ro.nca.bc;

import java.util.Arrays;

public class QuickSort2 {

    private int[] arr;

    public QuickSort2(int[] arr) {
	this.arr = arr;
    }

    public void sort() {
	sort(0, arr.length - 1);
    }

    private int placeFirstElementInFinalPositionWithinRange(int first, int last) {
	int pivot = first;
	for (int number = first + 1; number <= last; number++) {
	    if (isSmaller(number, pivot)) {
		moveNumberToLeftOfPivot(number, pivot);
		pivot++;
	    }
	}
	return pivot;
    }

    private void sort(int first, int last) {
	if (first < last) {
	    int splitPosition = placeFirstElementInFinalPositionWithinRange(first, last);
	    System.out.println("splitPosition = " + splitPosition);
	    sort(first, splitPosition - 1);
	    sort(splitPosition + 1, last);
	}
    }

    private boolean isSmaller(int positionOfA, int positionOfB) {
	return arr[positionOfA] <= arr[positionOfB];
    }

    private void moveNumberToLeftOfPivot(int number, int pivot) {
	for (int newPosition = number - 1; newPosition >= pivot; newPosition--) {
	    swap(number, newPosition);
	    number = newPosition;
	}
    }

    private void swap(int i, int j) {
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
	System.out.println(Arrays.toString(arr));
    }
}
