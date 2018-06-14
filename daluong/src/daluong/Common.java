package daluong;

public class Common {

	public synchronized void show(int n) {
		for (int i = 0; i < 5; i++) {
			System.out.println(n + i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
	}

}
