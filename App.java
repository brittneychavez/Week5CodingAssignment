package Week5;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		6.     Create a class named App that has a main method.

//		a.  In this class instantiate an instance of each of your logger classes that 
//		implement the Logger interface.

//		b. Test both methods on both instances, passing in Strings of your choice.
		
		AsteriskLogger al = new AsteriskLogger();
		SpacedLogger sl = new SpacedLogger();
		al.log("Hello");
		al.error("Hello");
		sl.log("Hello");
		sl.error("Hello");



	
	}

}
