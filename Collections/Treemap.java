package Collections;
import java.util.*;
import java.util.Set;
import java.util.TreeSet;

public class Treemap {

    public static void main(String args[]) {
        // Create a tree set
        TreeSet cars = new TreeSet();
        // Add elements to the tree set
        cars.add("Camaro");
        cars.add("Colorado");
        cars.add("Cruze");
        cars.add("Malibu");
        cars.add("Impala");
        cars.add("Silverado");
        cars.add("Spark");
        System.out.println(cars);
        System.out.println();

       

//reverse
        List<Integer> list = new ArrayList<Integer>(cars);
        java.util.Collections.reverse(list);
        System.out.println(list);


    }
}