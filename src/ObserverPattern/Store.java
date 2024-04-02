package ObserverPattern;

public class Store {

	public static void main(String[] args) {
		
		StocksObservable iphoneObservable = new IphoneObservableImpl();
		
		NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz", iphoneObservable);
		NotificationAlertObserver observer2 = new EmailAlertObserverImpl("abc", iphoneObservable);
		NotificationAlertObserver observer3 = new MobileAlertObserverImpl("99309264", iphoneObservable);
		
		iphoneObservable.add(observer1);
		iphoneObservable.add(observer2);
		iphoneObservable.add(observer3);
		
		iphoneObservable.setStockCount(10);
	}

}
