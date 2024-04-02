package chainOfResponsibility;

public class InfoLogger extends Logger {
	
	public InfoLogger(Logger nextLogger) {
		super(nextLogger);
		// TODO Auto-generated constructor stub
	}
	
	public void log(int logLevel, String message) {
		if(logLevel == INFO) {
			System.out.println("INFO: " + message);
		} else {
			nextLogger.log(logLevel, message);
		}
	}

}
