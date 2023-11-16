package arrays_02_02;
public class LowArray {	
	private int[] arr;
	
	// contructor , create array
	public LowArray(int size) {	
		arr = new int[size];
	}
	
	// set value 
	public void setElement(int index, int item) {
		arr[index] = item;
	}

	// get item
	public int getItem(int index) { 
		return arr[index];
	}
}
