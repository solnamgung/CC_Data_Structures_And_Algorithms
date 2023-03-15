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
	public int binarySearch(int item) {
		int lowerBound = 0;
		int upperBound = count -1;
		int currentIdx;
		
		while(true) {
			
		currentIdx = (lowerBound + upperBound) / 2;
		
		if(array[currentIdx] == item) 
			return currentIdx;
		else if(lowerBound > upperBound) 
			return count;
		else {
			if(array[currentIdx] > item)
				  upperBound = currentIdx - 1;
			else
				 lowerBound = currentIdx + 1;
			}
		}
		
	}
	
	
	public boolean delete(int item) {
		int i = binarySearch(item);
		
		if(i == count)
			return false;
		else
			for(int k = i; k < count; k++) {
				array[k] = array[k+1];
			}
		count--;
		return true;
	}
	
	

	public void print() {
		for(int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
