
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
		System.out.print(this.manufacturer + "���� ���� ");
		System.out.print(this.year + "���� ");
		System.out.println(this.size + "��ġ TV");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv myTv = new Tv("LG", 2017, 32); //LG���� ���� 2017�� 65��ġ
		myTv.show();

	}

}
