package week5Assignment;

public class SpacedLogger implements Logger {

	
	public void log(String info) {
		
		StringBuilder str = new StringBuilder( "" );
		
		for ( int i = 0; i < info.length(); i++ ) {
			
			str.append( " " + info.charAt( i ) );
			
		}
		
		System.out.println( str.toString() );
		
	}

	// I understand that there is a very fun opportunity here to use the log() command 
	// instead of copying and pasting all of this a second time. I couldn't think of how to make
	// a new line if log() was called by itself
	public void error(String err) {
		
		StringBuilder str = new StringBuilder( "" );
		
		for ( int i = 0; i < err.length(); i++ ) {
			
			str.append( " " + err.charAt( i ) );
			
		}
		
		System.out.println( " ERROR:" + str.toString() );
		
		
	}
	

}
