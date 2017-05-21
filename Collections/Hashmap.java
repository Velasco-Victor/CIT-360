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

      
        for(Object key: cars.keySet())
        System.out.println(key + " - " + cars.get(key));
        System.out.println();

        //Print out the vehicle year.
        System.out.println("The Toyota is a "
                + cars.get("Toyota") + "\n");

                // Clear all values.
        cars.clear();

        //Nasty Path add in a vehicle with with a null year and string values
        cars.put("Honda", "2000");
        cars.put("Volkswagen", "1993");
        cars.put("Lamborghini", null);

        for(Object key: cars.keySet())
            System.out.println(key + " - " + cars.get(key));
        System.out.println();

        System.out.println("The Lamborghini is a "
                + cars.get("Lamborghini") + "\n");

        // Clear all values.
        cars.clear();

        //Nasty Path add in a null vehicle with with a year
        cars.put("Aston Martin", 1985);
        cars.put("BMW", 1995);
        cars.put("Camaro", 1954);

        for(Object key: cars.keySet())
            System.out.println(key + " - " + cars.get(key));
        System.out.println();

        System.out.println("The Camaro is a "
                + cars.get(null) + "\n");

        System.out.println(cars);
        System.out.println();


        //Nasty Path add in a null vehicle and null year this replaces the null vehicle from the last Nasty Path
        cars.put(null, null);

        System.out.println("The null is a "
                + cars.get(null) + "\n");

        System.out.println(cars);
        System.out.println();

        //Nasty Path trys to pull a value from a non existent key
        System.out.println(cars.get("Model A"));
        System.out.println();

        // Nasty Path this prints my vehicle message multiple times because it runs the print till it runs out cars
        // in the map cause I used a for command where I shouldn't have
        for(Object key: cars.keySet())
        System.out.println("The BMW is a "
                + cars.get("BMW") + "\n");

        //Nasty Path adding a empty string value into the map
        cars.put("Model T", "");
        System.out.println(cars);
        System.out.println();


        //Happy path print true if the Value and the Key are in the Map
        // it will print false for the Volkswagen since it has been cleared
        System.out.println(cars.containsKey("Volkswagen"));
        System.out.println();

        //Prints true since it finds the value
        System.out.println(cars.containsValue(1985));
        System.out.println();

        //Nasty Path prints true because it does find a null in the hashmap
        System.out.println(cars.containsKey(null));
        System.out.println();

        // Print the size of the hash map
        System.out.println("The Hash Map has " + cars.size() + " cars");
        System.out.println();

        //Happy Path remove a key value
        cars.remove("BMW");
        System.out.println("BMW has been removed");
        System.out.println();

        // Print the size of the hash map
        System.out.println("The Hash Map has " + cars.size() + " cars");
        System.out.println();

        //Nasty Path remove a key value that doesn't exist
        cars.remove("Volkswagen");
        System.out.println("Volkswagen was not removed!");
        System.out.println();

        // Print the size of the hash map
        System.out.println("The Hash Map has " + cars.size() + " cars");
        System.out.println();

        // Nasty Path removes the null
        cars.remove(null);
        System.out.println("Null has been removed");
        System.out.println();

        // Print the size of the hash map
        System.out.println("The Hash Map has " + cars.size() + " cars");
        System.out.println();
    }
}