package chainOfResponsibility;

public class ErrorLogger extends Logger {

	public ErrorLogger(Logger nextLogger) {
		super(nextLogger);
		// TODO Auto-generated constructor stub
	}
	
	public void log(int logLevel, String message) {
		if(logLevel == ERROR) {
			System.out.println("ERROR: " + message);
		} else {
			nextLogger.log(logLevel, message);
		}
	}

}
