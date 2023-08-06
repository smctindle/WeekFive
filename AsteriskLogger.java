package week5codingassignment;


public class AsteriskLogger implements Logger{

	@Override
	public void log(String log) { 
		System.out.println("***" + log + "***");
	System.out.println(); 	
		}
	@Override
	public void error(String error) {
		System.out.println("********************"
				+ "\n*** Error: " + error + " ***"
				+ "\n********************");
		System.out.println();
		
	}
	

}
