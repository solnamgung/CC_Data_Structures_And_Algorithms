package arrays_02_04;

public class OrderArray {

	private int[] array;
	private int count;
	
	public OrderArray(int size) {
		array = new int[size];
		count = 0;
	}
	
	public int size() {
		return count;
	}
	

	public void insert(int item) {
		int i;
		for(i = 0; i < count; i++) {
			if(array[i] > item)
				break;
		}
		
		for(int k = count; k > i; k--)
			array[k] = array[k-1];
		
		array[i] = item;
		count++;
	}
	
	
	
	// search as using binary search
	public int findItem(int item) {
		int lowerBound = 0;
		int upperBound = count -1;
		int currentIdx;
		
		while(true) {
			currentIdx = (lowerBound + upperBound) / 2; //4
			
			if(array[currentIdx] == item) {
				return currentIdx;
			} else if (lowerBound > upperBound) {
				return -1;
			} else {
				if(array[currentIdx] < item) 
					lowerBound = currentIdx + 1;
				else
					upperBound = currentIdx -1;
			}
		}
		
		
		
	}
	
	

	public void print() {
		for(int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
