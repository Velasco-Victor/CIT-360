package Collections;
import java.util.*;
public class CollectionExamples {

	public static void main(String[] args) {
		String[] things ={"eggs", "lasers", "hats", "pie"};
		//What type of Data?
		List<String> list1 = new ArrayList<String>();

		//Add array items to list
		for(String x: things){
			list1.add(x);
		}

		String[] morethings ={"lasers", "hats"};
		List<String> list2 = new ArrayList<String>();

		//Add array items to list
		for(String y: morethings){
			list2.add(y);
		}
			//Print out list 1
			for (int i = 0; i < list1.size(); i++){
				System.out.printf("%s ",  list1.get(i));
			}
			editlist(list1,list2);
			System.out.println();

			for (int i = 0; i < list1.size(); i++){
				System.out.printf("%s ",  list1.get(i));
			}
		}
	

	//method
	public static void editlist(Collection<String> list1, Collection<String> list2) {
		Iterator<String> it = list1.iterator();
		while(it.hasNext()){
			if(list2.contains(it.next())){
				it.remove();
			}
		}

	}
}


