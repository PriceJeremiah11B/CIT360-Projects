import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {

		public static void main(String[] args) {
			String[] fruit = { "Apples", "Pears", "Tomatoes", "Grapes"};
			
			System.out.println("Standard fruity array " + fruit + "\n");
			
			List<String> fruitList = new ArrayList<String>(Arrays.asList(fruit));
			
			System.out.println("This is a List: " + fruitList + "\n");
			fruitList.add("Apples");
			fruitList.add("Grapes");
			//these are duplicate values, which the array will allow to add, regardless.
			//the array is non-bias against the data.
			
			System.out.println("List after adding things: " + fruitList + "\n");
			
			
		}
	
}
