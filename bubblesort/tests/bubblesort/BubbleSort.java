package bubblesort;

public class BubbleSort {

	public static int[] sort(int[] is) {

		if(is[0]>is[1]){
			int temp = is[0];
			is[0] = is[1];
			is[1] = temp;
			return is;
		}
		return is;
	}

}
