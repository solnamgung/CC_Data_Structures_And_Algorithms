package arrays_02_02;

public class LowArrayApp {
	
	public static void main(String[] args) {
		LowArray arr;
		arr = new LowArray(100);
		int count ;
		int j;
		
		arr.setElement(0, 77);
		arr.setElement(1, 22);
		arr.setElement(2, 11);
		arr.setElement(3, 43);
		arr.setElement(4, 55);
		arr.setElement(5, 66);
		arr.setElement(6, 78);
		arr.setElement(7, 90);
		arr.setElement(8, 01);
 
		count = 9;
			
		// search for data item
		int searchItem = 0;
		for(j = 0; j < count; j++) {
			if(arr.getItem(j) == searchItem)
				break;
		}
		
		if(j == count) 
		{
			System.out.println();
			System.out.println("Cannot find >>>> " + searchItem);
		}
		else {
			System.out.println();
			System.out.println("Find >>>>>> " + searchItem);
		}
		
		
		// delete the value as using the break..
		int deleteVal2 = 77;
		for(j = 0; j < count; j++) {
			if(arr.getItem(j) == deleteVal2) 
				break;
		}
		for(int i =  j; i < count; i++)
			arr.setElement(i, arr.getItem(i+1));
		count--;
		
		
		// display Item
		for(j = 0;  j < count; j++) {
			if(j == 0 ) {
				System.out.print("[ " + arr.getItem(j) + ", ");
			}
			else if(j == count - 1) {
				System.out.print(arr.getItem(j)  +  " ]");	
			}  
			else {
				System.out.print(arr.getItem(j)  +  ", ");
			}	
		}
		
		
		
		
	}
}




