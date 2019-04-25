import javax.swing.*;
import java.awt.*;

public class GraphicsDrawImageEx1 extends JFrame{
	private Mypanel panel = new Mypanel();
	
	public GraphicsDrawImageEx1(){
		setTitle("원본 크기로 원하는 위치에 이미지 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(300,400);
		setVisible(true);
	}
	
	class Mypanel extends JPanel{
		private ImageIcon icon = new ImageIcon("images/image0.jpg");
		private Image img = icon.getImage();
		
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			
			g.drawImage(img, 20, 20, this);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new GraphicsDrawImageEx1();
	}

}
