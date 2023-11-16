package arrays_02_05;

public class ClassDataArray {

	private Person[] arr;
	private int count;
	
	public ClassDataArray(int max) {
		
		arr = new Person[max];
		this.count = 0;
	}
	
	public void insert(String last, String first, int age) {
		arr[count] = new Person(last, first, age);
		count++;
	}
	
	public Person find(String searchName) {
		int i;
		for(i = 0; i < count; i++) {
			if(arr[i].getLastname().equals(searchName))
				break;
		}
		if(i == count) //means the loop did not find a 'Person' object with the specified last name.
			return null;
		else
			return arr[i];
	}
	

	
	public boolean delete(String searchName) {
		int i;
		for(i = 0; i < count; i++) {
			if(arr[i].getLastname().equals(searchName))
				break;
		}
		if(i == count) 
			return false;
		for(int k = i; k < count; k++) {
			arr[k] = arr[k+1];
		}
		count--;
		return true;
	}
	
	public void displayA() {
		for(int i = 0; i < count; i++) {
			arr[i].displayPerson();
		}
		
	}
	
	
}
