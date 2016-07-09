package learn.java8.features.lamdaexpressions;

import java.util.Arrays;
import java.util.List;

public class LamdaExpressionsMain {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("raja","jack","vishu","jacob");
		
		StringSort sortStrings = new StringSort();
		sortStrings.sortListofStringsWithJava7Style(names);
		System.out.println("Java 7 style Sorting in ascending order..."+names);
		
		sortStrings.sortListOfStringsWithJava8Style(names);
		System.out.println("Java 8 style Sorting in descending order..."+names);

	}

}
