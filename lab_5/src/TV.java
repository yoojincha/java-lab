class TV1 {
	private int size;
	public TV1(int size) { this.size = size; }
	protected int getSize() { return size; }
}

class ColorTV extends TV1 {
	private int color;
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	protected int getColor() { return color; }
	public void printProperty() {
		System.out.println("나의 Color TV는 "+getSize()+"인치 "+getColor()+"컬러");
	}
}

public class TV {
	public static void main(String args[]) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
	}
}