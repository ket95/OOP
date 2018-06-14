package daluong;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ThreadTest tt1 = new ThreadTest(); tt1.setName("luong 1"); ThreadTest tt2 =
		 * new ThreadTest(); tt2.setName("LUong 2"); ThreadTest tt3 = new ThreadTest();
		 * tt3.setName("Luong 3");
		 * 
		 * tt1.start(); tt2.start();
		 */

		// ThreadTest2 tt1 = new ThreadTest2();
		//
		// Thread t1 = new Thread(tt1);
		// t1.setName("thread 1");
		// Thread t2 = new Thread(tt1);
		// t2.setName("thread 2");
		//
		// t1.start();;
		// t2.run();
		//

		Common common = new Common();
		ThreadTest3 tt3 = new ThreadTest3(common);
		ThreadTest4 tt4 = new ThreadTest4(common);

		tt4.start();
		tt3.start();

	}

}