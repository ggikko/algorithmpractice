package bubblesort;

import static org.junit.Assert.*;

import org.junit.Test;

public class BubbleSortTests {
	
	/*
	 * Todolist
	 * 
	 * 1. 0,1 -> 0,1
	 * 2. 1,0 -> 0,1
	 * 3. 
	 * 
	 * Done
	 * 1 ok,2 ok
	 *
	 */

	@Test
	public void sortSortedList() {
		checkBubbleSortedArrayReturnExpected(new int[]{0,1}, BubbleSort.sort(new int[]{0,1}));
	}

	private void checkBubbleSortedArrayReturnExpected(int[] expectedArray, int[] inputArray) {
		assertArrayEquals(expectedArray, inputArray);
	}
	
	@Test
	public void sortUnsortedListOfLengthTwo() throws Exception {
		assertArrayEquals(new int[]{0,1}, BubbleSort.sort(new int[]{1,0}));
	}
	

}
