import java.util.Scanner; // CTRL + SHIFT + O CTRL + SHTFT + F CTRL + SPACE

public class Rectangle {
    int width;
    int height;
    
    public Rectangle() {
		
	}
    
    public int getArea() {
       return width * height;
       
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle(); //��ü
		Scanner scan = new Scanner(System.in); //Ű���� �Է�
		
		rect.width = scan.nextInt();
		rect.height = scan.nextInt();
		
		System.out.println("�簢�� ����" + rect.getArea());
		
		scan.close();

	}

}
