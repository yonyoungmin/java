
public class Circle {
	int radius; // ������
	String name; //���� �̸�
	
	public Circle () {
		
	}
		
	public double getArea() {
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle pizza;
		pizza = new Circle();
		pizza.radius = 5;
		pizza.name="å������";
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ����" + area);

		Circle dount = new Circle();
		dount.radius = 3;
		dount.name = "�Ӹ�";
		area = dount.getArea();
		System.out.println(dount.name +"�� ����" + area);
		
	}

}
