package daluong;

public class ThreadTest3 extends Thread {
	private Common cm;

	public ThreadTest3(Common cm) {
		this.cm = cm;
	}

	@Override
	public void run() {
		cm.show(5);
		super.run();
	}

}
