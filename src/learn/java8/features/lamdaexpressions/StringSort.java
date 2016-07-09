package learn.java8.features.lamdaexpressions;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringSort {
	
	public void sortListofStringsWithJava7Style(List<String> names){
		Collections.sort(names, new Comparator<String>() {
		    public int compare(String a, String b) {
		        return a.compareTo(b);
		    }
		});
	}
	
	public void sortListOfStringsWithJava8Style(List<String> names){
		Collections.sort(names,(a,b)-> b.compareTo(a));
	}
	
	

}
