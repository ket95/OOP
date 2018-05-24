package xml;

import java.util.ArrayList;
import java.util.Scanner;


public class Player extends Tank {

	public Player(String direction, boolean isAutoMoving, String left, String size, float speed, String top,
			ArrayList<Bullet> arrBullets) {
		super(direction, isAutoMoving, left, size, speed, top, arrBullets);
		// TODO Auto-generated constructor stub
	}
	public void handleInput() {
System.out.println("Tạo nhân vật: Y or N");
Scanner sca = new Scanner(System.in);
String k= sca.nextLine();

if(k=="Y" || k=="y") {
	System.out.println("Tạo nhân vật thành công");
	
}
else {
	System.out.println("Tạo nhân vật thất bại");
}
	}
}
