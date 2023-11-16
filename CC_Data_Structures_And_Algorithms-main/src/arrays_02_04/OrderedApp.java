package arrays_02_04;

public class OrderedApp {
	public static void main(String[] args) {
		
		OrderArray arr = new OrderArray(10);
		
		arr.insert(10);
		arr.insert(70);
		arr.insert(80);
		arr.insert(90);
		arr.insert(20);
		arr.insert(3);
		arr.insert(1);
			
		System.out.println("binary search >>>> " + arr.binarySearch(70));
		arr.delete(10);
		arr.print();
	}

}
