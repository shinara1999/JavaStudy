import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainClass_2 extends JFrame implements ItemListener{
	JComboBox box=new JComboBox();
	public MainClass_2()
	{
		box.addItem("주찬양");
		box.addItem("전영중");
		box.addItem("성준수");
		add("North", box);
		setSize(300, 150);
		setVisible(true);
		box.addItemListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		}catch(Exception ex) {}
		
		new MainClass_2();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==box)
		{
			String name=box.getSelectedItem().toString();
			System.out.println(name);
		}
	}

}
