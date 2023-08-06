package week5codingassignment;

public class Application  {

	public static void main(String[] args) {
		Logger AsteriskLogger = new AsteriskLogger();
		AsteriskLogger.log("Hello" ); 
		AsteriskLogger.error("Hello");
		
		Logger SpacedLogger = new SpacedLogger(); 
		SpacedLogger.log("Hello");
		SpacedLogger.error("Hello");
		

	}

}
