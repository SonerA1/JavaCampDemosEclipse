package kodlamaIOoop.core.logging;

public class DatabaseLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Logged to Database :  " + data);
		
	}

}
