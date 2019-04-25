import javax.swing.*;
import java.awt.*;

public class GraphicsDrawImageEx2 extends JFrame{
	private Mypanel panel = new Mypanel();
	
	public GraphicsDrawImageEx2(){
		setTitle("�г��� ũ�⿡ ���߾� �̹��� �׸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(200,300);
		setVisible(true);
	}
	
	class Mypanel extends JPanel{
		private ImageIcon icon = new ImageIcon("images/image0.jpg");
		private Image img = icon.getImage();
		
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new GraphicsDrawImageEx2();
	}

}
