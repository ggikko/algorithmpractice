package bubblesort;

import static org.junit.Assert.*;

import org.junit.Test;

public class BubbleSortTests {

	/*
	 * Todolist
	 * 
	 * 1. 0,1 -> 0,1 
	 * 2. 1,0 -> 0,1 3.
	 * 3. 0,1,2 - > 0,2,1
	 * 4. 0,1,2 -> 2,1, 0
	 * 5. 0,1,2,3 -> 0,2,1,3
	 * 6. 0,1,2,3 -> 3,1,0,2
	 * 
	 * Done 
	 * 1 ok
	 * 2 ok 
	 * 3 ok
	 * 4 ok
	 * 
	 */
	
	@Test
	public void sortSortedList() {
		checkBubbleSortedArrayReturnsExpected(new int[] { 0, 1 }, new int[] { 0, 1 });
	}

	@Test
	public void sortUnsortedListOfLengthTwo() throws Exception {
		checkBubbleSortedArrayReturnsExpected(new int[] { 0, 1 }, new int[] { 1, 0 });
	}

	@Test
	public void sortPartiallyUnsortedArrayOfLengthThree() throws Exception {
		checkBubbleSortedArrayReturnsExpected(new int[] { 0, 1, 2 }, new int[] { 0, 2, 1 });
	}
	
	@Test
	public void sortUnsortedArrayOfLengthThree() throws Exception {
		checkBubbleSortedArrayReturnsExpected(new int[] { 0, 1, 2 }, new int[] { 2, 1, 0 });
	}


	private void checkBubbleSortedArrayReturnsExpected(int[] expectedArray, int[] inputArray) {
		assertArrayEquals(expectedArray, BubbleSort.sort(inputArray));
	}

}
