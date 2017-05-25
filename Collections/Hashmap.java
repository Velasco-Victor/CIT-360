package Collections;
import java.util.HashMap;


public class Hashmap {

	public static void main(String[] args) {

		HashMap cars = new HashMap();


		cars.put("Toyota", 2001);
		cars.put("Ford", 2002);
		cars.put("Mitsubishi", 2003);
		cars.put("Ferrari", 2003);

		System.out.println("Total cars: " + cars.size());

		//Print out all cars and year
		for(Object key: cars.keySet())
			System.out.println(key + " - " + cars.get(key));
		System.out.println();

		//Print out the vehicle year.
		System.out.println("The Toyota is a " + cars.get("Toyota") + "\n");

		// Clear all values.
		cars.clear();

		// Print the size of the hash map
		System.out.println("The Hash Map has " + cars.size() + " cars"); // 0
		System.out.println();

		cars.put("Toyota", 2001);
		cars.put("Ford", 2002);
		cars.put("Mitsubishi", 2003);
		cars.put("Ferrari", 2003);

		//remove a key value
		cars.remove("Toyota");
		System.out.println("Toyota has been removed");
		System.out.println();

		// Print the size of the hash map again
		System.out.println("The Hash Map has " + cars.size() + " cars");
		System.out.println();


		for(Object key: cars.keySet())
			System.out.println(key + " - " + cars.get(key));        
	}
}