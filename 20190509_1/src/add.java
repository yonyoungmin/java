import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class add extends JFrame{
	public add(){
		setTitle("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridBagLayout grid = new GridBagLayout();
		Container c = getContentPane();
		c.setLayout(grid);
		setBackground(Color.WHITE);
		setLayout(new GridLayout(4,4,5,5));
		for(int i=1;i<=9;i++)

		c.add(new JButton(Integer.toString(i)));
		c.add(new JTextField(""));
		c.add(new JButton("0"));
		c.add(new JButton("+"));
		c.add(new JButton("-"));
		c.add(new JButton("*"));
		c.add(new JButton("/"));
		
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
    // TODO Auto-generated method stub
	    
class SouthPanel extends JPanel{
	public SouthPanel(){
		setBackground(Color.PINK);
		setOpaque(true);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new JLabel("계산결과"));
		add(new JTextField(15));
	  }
   }
}
class NorthPanel extends JPanel{
	public NorthPanel(){
	         setBackground(Color.LIGHT_GRAY);
	         setOpaque(true);
	         setLayout(new FlowLayout());
		     add(new JLabel("수식 입력"));
		     add(new JTextField(16));
		}
    }
}


        