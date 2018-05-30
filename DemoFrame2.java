import java.awt.event.*;
import java.awt.*;

public class DemoFrame2 extends Frame implements ActionListener
{
	String str1="hello welcome to learning java portal"+"\nplease choose your prefference";
	String str=" ";
	Button b1,b2,b3;
	public DemoFrame2()
	{
		 setSize(500, 300);
		 setBackground(Color.MAGENTA);
		 setLayout(new FlowLayout());
		 b1=new Button("JAVA SE");
		 b2=new Button("JAVA ME");
		 b3=new Button("JAVA EE");
		 add(b1);
		 add(b2);
		 add(b3);
		 b1.addActionListener(this);
		 b2.addActionListener(this);
		 b3.addActionListener(this);
		 addWindowListener(new WindowAdapter() 
		 {
			 @Override
			 public void windowClosing(WindowEvent we)
			 {
				 dispose();
			 }
		});	 
	}
	 public static void main(String args[])
	 {
		 DemoFrame2 d=new DemoFrame2();
		 d.setVisible(true);
	 }
   public void paint(Graphics g)
   {
	    g.drawString(str1, 25, 100);
	    g.drawString("Course Selected:"+str, 25, 120);
   }
  @Override
public void actionPerformed(ActionEvent arg0) 
  {
	if(arg0.getActionCommand()=="JAVA SE")
	{
		str=b1.getLabel();	
	}
	if(arg0.getActionCommand()=="JAVA SE")
	{
		str=b1.getLabel();	
	}
	if(arg0.getActionCommand()=="JAVA SE")
	{
		str=b1.getLabel();	
	}
 }
}