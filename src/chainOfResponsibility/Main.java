package chainOfResponsibility;

public class Main {
	
	public static void main(String[] args) {
		Logger logger = new ErrorLogger(new InfoLogger(new DebugLogger(null)));
		logger.log(Logger.DEBUG, "something went wrong");
	}

}
