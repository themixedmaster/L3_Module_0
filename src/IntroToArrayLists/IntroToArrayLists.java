package IntroToArrayLists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		ArrayList<String> array = new ArrayList <>();
		//   Don't forget to import the ArrayList class
		
		//2. Add five Strings to your list
		array.add("Billy Bob Joe");
		array.add("Billy Bob Joe Bob Joe");
		array.add("Billy Joe Joe Bob Billy");
		array.add("Billy Joe Joe Bob Joe Joe");
		array.add("Steve");
		array.add("5 Grapes");
		array.add("A picture of a muffin");
		array.add("A famous Kazoo player");
		array.add("Billy Joe Bob Joe Billy Joe Joe Bob Joe Billy");
		//3. Print all the Strings using a standard for-loop
		//for(int o = 0; o < array.size(); o++){
		//	System.out.println(array.get(o));
		//}
		//4. Print all the Strings using a for-each loop
		//for(String qwertyuiop: array){
		//	System.out.println(qwertyuiop);
		//}
		//5. Print only the even numbered elements in the list.
		//for(int o = 0; o < array.size(); o = o + 2){
		//	System.out.println(array.get(o));
		//}
		//6. Print all the Strings in reverse order.
		//for(int o = 8; o >= 0; o--){
		//	System.out.println(array.get(o));
		//}
		//7. Print only the Strings that have the letter 'e' in them.
		for(int o = 0; o < array.size(); o++){
			if(array.get(o).contains("e")){
				System.out.println(array.get(o));
			}
		}
	}
}
