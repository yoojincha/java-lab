package tvs;

class TV2 {
	private int size;
	public TV2(int size) { this.size = size; }
	protected int getSize() { return size; }
}

class ColorTV1 extends TV2 {
	private int color;
	public ColorTV1(int size, int color) {
		super(size);
		this.color = color;
	}
	protected int getColor() { return color; }
	public void printProperty() {
		System.out.println(getSize()+"인치 "+getColor()+"컬러");
	}
}

class IPTV extends ColorTV1 {
	private String IP;
	public IPTV(String IP, int size, int color) {
		super(size, color);
		this.IP = IP;
	}
	protected String getIP() { return IP; }
	public void printProperty() {
		System.out.print("나의 IPTV는 "+getIP()+" 주소의 ");
		super.printProperty();
	}
}

public class color_iptv {
	public static void main(String args[]) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}
}