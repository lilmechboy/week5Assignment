package week5Assignment;

public class AsteriskLogger implements Logger{

	public void log(String info) {

		System.out.println( "***" + info + "***" );
		
	}

	public void error(String err) {
		
		StringBuilder str = new StringBuilder( "******" );
		
		for ( int i = 0; i < err.length(); i++ ) {
			str.append( "*" );
		}
		
		System.out.println( str.toString() );
		System.out.println( "***" + err + "***" ) ;
		System.out.println( str.toString() );
		
	}

}
