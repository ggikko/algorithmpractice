package bubblesort;

import static org.junit.Assert.*;

import org.junit.Test;

public class BubbleSortTests {

	@Test
	public void sortSortedList() {
		assertArrayEquals(new int[]{0,1}, BubbleSort.sort(new int[]{0,1}));
	}

}
