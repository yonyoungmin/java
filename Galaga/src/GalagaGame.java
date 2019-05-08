import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GalagaGame extends JPanel implements KeyListener{
	
	private boolean running = true;
	
	private ArrayList sprites = new ArrayList();
	private Sprite starship;
	
	private BufferedImage alienImage;
	private BufferedImage shotImage;
	private BufferedImage shipImage;
	
	public GalagaGame(){
		JFrame frame = new JFrame("Galaga Game");
		
		frame.setSize(800, 600);
		frame.add(this);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		try{
			shotImage = ImageIO.read(new File("fire.png"));
			shipImage = ImageIO.read(new File("starship.png"));
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
