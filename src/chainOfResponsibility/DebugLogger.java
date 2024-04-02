package chainOfResponsibility;

public class DebugLogger extends Logger {
	
	DebugLogger(Logger nextLogger) {
		super(nextLogger);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void log(int logLevel, String message) {
		if(logLevel == DEBUG) {
			System.out.println("DEBUG: " + message);
		} else {
			nextLogger.log(logLevel, message);;
		}
	}

}
