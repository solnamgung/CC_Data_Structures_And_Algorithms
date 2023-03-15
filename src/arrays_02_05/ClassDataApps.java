package arrays_02_05;

public class ClassDataApps {

	public static void main(String[] args) {
		int maxSize = 10;
		ClassDataArray array;
		array = new ClassDataArray(maxSize);
		
		array.insert("kim" , "sol"   , 18);
		array.insert("dfm" , "fol"   , 17);
		array.insert("fim" , "sggl"  , 15);
		array.insert("bnim", "ssl"   , 13);
		array.insert("fmd" , "sfldf" , 12);
		array.insert("kdd" , "sbbbl" , 10);
		
		String name = "kim";
		
		Person found = array.find(name);
		
		if(found != null) {
			System.out.println("Find >>>> " + name);
			found.displayPerson();
		} else
			System.out.println("Cannot find >>>> " + name);
		
		array.delete("kdd");
		
		array.displayA();
		
	}
}
