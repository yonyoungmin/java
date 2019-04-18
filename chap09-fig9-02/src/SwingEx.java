import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class SwingEx extends JFrame{
	public SwingEx(){
		setTitle("���� ������Ʈ ���̱� ����");
		createMenu();
		createToolBar();
		createSplitpane();
		setSize(500, 400);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		mb.add(new JMenu("File"));
		mb.add(new JMenu("Edit"));
		mb.add(new JMenu("Source"));
		mb.add(new JMenu("Project"));
		mb.add(new JMenu("Run"));
		
		this.setJMenuBar(mb);
	}
	
	private void createToolBar(){
		JToolBar bar = new JToolBar("kitae Menu");
		
		bar.setBackground(Color.LIGHT_GRAY);
		bar.add(new JButton("New"));
		bar.add(new JButton(new ImageIcon("images/open.jpg")));
		bar.addSeparator();
		bar.add(new JButton(new ImageIcon("images/save.jpg")));
		bar.add(new JLabel("search"));
		bar.add(new JTextField("text fiend"));

		JComboBox<String> combo = new JComboBox<String>();
		combo.addItem("Java");
		combo.addItem("C#");
		combo.addItem("C");
		combo.addItem("C++");
		bar.add(combo);
		add(bar, BorderLayout.NORTH);
	}
	
	private void createSplitpane(){
		String [] fruits= {"apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strqwberry", "blackberry"};
		JList<String> scrollList = new JList<String>(fruits);
		JSplitPane pane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,new JScrollPane(scrollList), new JScrollPane(new JLabel(new ImageIcon("images/img1.jpg"))));
		add(pane, BorderLayout.CENTER);
	}		
		
	public static void main(String[] args) {
		new SwingEx();

	}

}
