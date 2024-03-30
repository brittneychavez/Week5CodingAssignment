package Week5;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		for (int i = 0; i < log.length(); i++) {
			 System.out.print(log.charAt(i)+ " ");
		}
		System.out.println();
	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		System.out.print("Error: ");
		for (int i = 0; i < error.length(); i++) {
			 System.out.print(error.charAt(i)+ " ");
		}
		System.out.println();
	}
//	5. Implement the SpacedLogger methods:

//	Note:  The SpacedLogger should add a space or " " between each character of the 
//	String argument passed into its methods.


//	a. If the log method received “Hello” as an argument, it should print H e l l o

//	b. The error method should do the same, but with “ERROR:” preceding the spaced 
//	out input (i.e. ERROR: H e l l o)
}
