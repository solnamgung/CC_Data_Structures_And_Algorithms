package arrays_02_03;
// demonstrate array class with high-level interface to run this program
public class HighArrayApps {

	public static void main(String[] args) {
		
		int maxSize = 100;
		HighArray arr = new HighArray(maxSize);
		
		arr.insert(10);
		arr.insert(20);
		arr.insert(30);
		arr.insert(40);
		arr.insert(50);
		arr.insert(60);
		arr.insert(70);
		arr.insert(80);
		arr.insert(90);
		
		arr.delete(30);
		
		if(arr.findItem(90))
			System.out.println("find the itme ");
		else {
			System.out.println("Cannot find the item");
		}
		
		arr.print();
	}
}
