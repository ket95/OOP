package test;

public class bullet {
	private float cX;
	private float cy;
	
	public bullet(float cX, float cy) {
		super();
		this.cX = cX;
		this.cy = cy;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("bullet [cX=");
		builder.append(cX);
		builder.append(", cy=");
		builder.append(cy);
		builder.append("]");
		return builder.toString();
	}

	public float getcX() {
		return cX;
	}

	public void setcX(float cX) {
		this.cX = cX;
	}

	public float getCy() {
		return cy;
	}

	public void setCy(float cy) {
		this.cy = cy;
	}
	

}
