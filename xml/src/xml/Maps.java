package xml;

public class Maps {
	private Data data;
	private float width;
	private float height;
	private float mVersion=1;
	
	public Maps(Data data, float width, float height) {
		super();
		this.data = data;
		this.width = width;
		this.height = height;
	}
	
	public void contain() {
		//To Do Some Things
	}
	public float update () {
		this.mVersion += 0.1;
		float a = this.mVersion;
		System.out.println("Bạn update thành công version từ " + mVersion + " Lên version "+ a);
		
		return mVersion;
		
	}
	public void draw() {
		//To Do Some Things
	}
	
	public void reset() {
		//To Do Some Things
	}
	
	
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Maps [data=");
		builder.append(data);
		builder.append(", width=");
		builder.append(width);
		builder.append(", height=");
		builder.append(height);
		builder.append("]");
		return builder.toString();
	}
	
	

}
