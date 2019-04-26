import javax.swing.*;
import java.awt.*;

public class GraphicsDrawArcEx extends JFrame{
	private Mypanel panel = new Mypanel();
	public GraphicsDrawArcEx(){
		setTitle("drawArc");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(200, 300);
		setVisible(true);
	}
	
	class Mypanel extends JPanel{
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.drawArc(20,100,80,80,90,270);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new GraphicsDrawArcEx();
	}

}
