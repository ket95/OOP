package xml;

public class Bullet {
private float cX;
private float cY;
private float speed;

public Bullet(float cX, float cY, float speed) {
	super();
	this.cX = cX;
	this.cY = cY;
	this.speed = speed;
}
public float getcX() {
	return cX;
}
public float getcY() {
	return cY;
}
public float getSpeed() {
	return speed;
}


@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Bullet [cX=");
	builder.append(cX);
	builder.append(", cY=");
	builder.append(cY);
	builder.append(", speed=");
	builder.append(speed);
	builder.append("]");
	return builder.toString();
}
public void setcX(float cX) {
	this.cX = cX;
}
public void setcY(float cY) {
	this.cY = cY;
}
public void setSpeed(float speed) {
	this.speed = speed;
}


}
