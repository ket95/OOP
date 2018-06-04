package dahinh;

public class Animal {
	private int numberOfLeg =4;
	private String color;
	
	public void speak() {
		System.out.println("Animal speak: ");
	}

	public int getNumberOfLeg() {
		return numberOfLeg;
	}

	public void setNumberOfLeg(int numberOfLeg) {
		this.numberOfLeg = numberOfLeg;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Animal [numberOfLeg=");
		builder.append(numberOfLeg);
		builder.append(", color=");
		builder.append(color);
		builder.append("]");
		return builder.toString();
	}

}
