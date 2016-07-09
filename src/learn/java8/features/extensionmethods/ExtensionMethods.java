package learn.java8.features.extensionmethods;

/**In java 8 we can define non abstract methods in interface with default Keyword.
 * Its called Extension Methods.
 * @author RAJASHEKHAR
 *
 */
public interface ExtensionMethods {
	
	/**abstract method
	 *...
	 * @param a
	 * @return
	 */
	double calculate(int a);
	/**non abstract methods.
	 * @param a
	 * @return
	 */
	default double sqrt(int a){
		return Math.sqrt(a);
	}

}
