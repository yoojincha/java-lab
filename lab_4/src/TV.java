public class TV{
	String brand;
	int year;
	int size;
	
	void show() {
	}
	
	public TV(int size) {
		System.out.println(size + "인치 TV");
	}
	
	public TV(int year, int size) {
		System.out.println(year + "년 " + size + "인치 TV");
	}
	
	public TV(String brand, int year, int size) {
		this.brand = brand;
		this.year = year;
		this.size = size;
		System.out.println(brand +"에서 만든 "+ year +"년 "+ size +"인치 TV");
	}
	
	 public static void main(String[] args) {
		 TV myTV = new TV("LG", 2017, 45);
		 myTV.show();
		 TV myTV1 = new TV(2018, 52);
		 myTV1.show();
		 TV myTV2 = new TV(65);
		 myTV2.show();

	 }
}
