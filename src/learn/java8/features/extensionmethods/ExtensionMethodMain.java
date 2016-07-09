package learn.java8.features.extensionmethods;

/**
 * @author RAJASHEKHAR
 *
 */
public class ExtensionMethodMain {

	public static void main(String[] args) {
		
		
		ExtensionMethods extensionMethod = new ExtensionMethodsImpl();
		
		double abstractResult = extensionMethod.calculate(10);
		System.out.println("Interfce abstract method result..."+abstractResult);
		
		double nonAbstractResult = extensionMethod.sqrt(4);
		System.out.println("Interfce non abstract method result..."+nonAbstractResult);
		
		

	}

}
