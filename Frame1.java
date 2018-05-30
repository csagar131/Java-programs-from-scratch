import java.awt.*;
import java.awt.event.*;
public class Frame1 extends Frame //implements ActionListener
{
 public Frame1()
 {
   setSize(300,250);
   setBackground(Color.red);
   setLayout(new FlowLayout());
   setLocationRelativeTo(this);
   addWindowListener(new WindowAdapter(){
   public void windowClosing(WindowEvent e)
   {
    System.exit(0);
	}
  });
  }
 public static void main(String args[])
 {
  Frame1 f=new Frame1();
  f.setVisible(true);
 }
}
