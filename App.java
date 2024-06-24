package week5Assignment;

public class App {
	


	public App() {

	}

	public static void main(String[] args) {

		
		AsteriskLogger asterisk = new AsteriskLogger();
		
		SpacedLogger spaced = new SpacedLogger();
		
		asterisk.log("Party");
		System.out.println();
		asterisk.error("Party");
		
		System.out.println();
		
		spaced.log("Hearty");
		System.out.println();
		spaced.error("Hearty");
		
		/* I added the new lines to make the output of the test look cleaner
		 * 
		 */

	}

}
