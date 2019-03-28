
public class Tv {
	private String manufacturer;
	private int year;
	private int size;
		
	public Tv(String manufacturer, int year, int size){
		this.manufacturer = manufacturer;
		this.year = year;
		this.size = size;
	}
	
	public void show(){
		System.out.print(this.manufacturer + "에서 만든 ");
		System.out.print(this.year + "년형 ");
		System.out.println(this.size + "인치 TV");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv myTv = new Tv("LG", 2017, 32); //LG에서 만든 2017년 65인치
		myTv.show();

	}

}
