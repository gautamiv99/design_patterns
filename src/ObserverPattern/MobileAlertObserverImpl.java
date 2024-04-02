package ObserverPattern;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
	
	String phoneNumber;
	
	StocksObservable observable;
	
	public MobileAlertObserverImpl(String phoneNumber, StocksObservable observable) {
		this.phoneNumber = phoneNumber;
		this.observable = observable;
	}
	
	@Override
	public void update() {
		sendEmail(phoneNumber, "product in stock, hurry up!!!");
	}
	
	private void sendEmail(String phoneNumber, String msg) {
		System.out.println("msg sent to : " + phoneNumber);
		//send actual email
	}

}
