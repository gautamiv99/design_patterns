package ObserverPattern;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
	
	 String emailId;
	
	StocksObservable observable;
	
	public EmailAlertObserverImpl(String emailId, StocksObservable observable) {
		this.emailId = emailId;
		this.observable = observable;
	}
	
	@Override
	public void update() {
		sendEmail(emailId, "product in stock, hurry up!!!");
	}
	
	private void sendEmail(String emailId, String msg) {
		System.out.println("email sent to : " + emailId);
		//send actual email
	}

}
