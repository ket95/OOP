package daluong;

public class ThreadTest extends Thread {

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName() + " i= "+i);
		}
		super.run();
	}     

	

}
