package daluong;

public class ThreadTest4 extends Thread {

	private Common cm;

	public ThreadTest4(Common cm) {
		this.cm = cm;
	}

	@Override
	public void run() {
		cm.show(10);
		super.run();
	}
}
