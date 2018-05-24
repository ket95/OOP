package xml;

import java.util.ArrayList;

public class Tank {
private String direction;
private boolean isAutoMoving;
private String left;
private String size;
private float speed;
private String top;
private ArrayList<Bullet> arrBullets;

public Tank(String direction, boolean isAutoMoving, String left, String size, float speed, String top,
		ArrayList<Bullet> arrBullets) {
	super();
	this.direction = direction;
	this.isAutoMoving = isAutoMoving;
	this.left = left;
	this.size = size;
	this.speed = speed;
	this.top = top;
	this.arrBullets = arrBullets;
}
public String getDirection() {
	return direction;
}
public void setDirection(String direction) {
	this.direction = direction;
}
public boolean isAutoMoving() {
	return isAutoMoving;
}
public void setAutoMoving(boolean isAutoMoving) {
	this.isAutoMoving = isAutoMoving;
}
public String getLeft() {
	return left;
}
public void setLeft(String left) {
	this.left = left;
}
public String getSize() {
	return size;
}
public void setSize(String size) {
	this.size = size;
}
public float getSpeed() {
	return speed;
}
public void setSpeed(float speed) {
	this.speed = speed;
}
public String getTop() {
	return top;
}
public void setTop(String top) {
	this.top = top;
}
public ArrayList<Bullet> getArrBullets() {
	return arrBullets;
}
public void setArrBullets(ArrayList<Bullet> arrBullets) {
	this.arrBullets = arrBullets;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Tank [direction=");
	builder.append(direction);
	builder.append(", isAutoMoving=");
	builder.append(isAutoMoving);
	builder.append(", left=");
	builder.append(left);
	builder.append(", size=");
	builder.append(size);
	builder.append(", speed=");
	builder.append(speed);
	builder.append(", top=");
	builder.append(top);
	builder.append(", arrBullets=");
	builder.append(arrBullets);
	builder.append("]");
	return builder.toString();
}

}
