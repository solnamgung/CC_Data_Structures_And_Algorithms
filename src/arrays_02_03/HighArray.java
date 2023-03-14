package arrays_02_03;

public class HighArray {

	private int[] arr;    // refer to array
	private int count;    //number of data items
	
	public HighArray (int max) {
		arr = new int[max];
		count = 0;
	}
	
	
	// insert items into array
	public void insert(int item) {
		arr[count] = item;
		count++;
	}
	
	
	// find specified values with using boolean
	public boolean findItem(int item) {
		int i;
		for(i = 0; i < count; i++) {
			if(arr[i] == item) 
				break;
			}
			
			if(i == count) 
				return false;
			else
				return true;
	}
	

	
	// delete items with using boolean
	public boolean delete(int item)
	{
		int i;
		for(i = 0; i < count; i++) {
			if(arr[i] == item) 
				break;
		}
		
		if(i == count) 
			return false;
			
		for(int k = i; k < count-1; k++)  //count = 10
				arr[k] = arr[k+1];
		count--;
		return true;
		
	}
	
	// display the items
	public void print() {
		System.out.println();
		for(int i = 0; i < count; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
}





