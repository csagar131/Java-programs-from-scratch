import java.awt.*;
import java.event.*;
public Fram1 extends Frame //implements ActionListener
{
 public Fram1()
 {
  setSize(300,250);
  setBackground(Color.red);
  setLayout(new FlowLayout());
  setContentRelativeTo(this);
  }

public static void main(String args[])
 {
 Frame1 f=new Frame1();
 f.setVisible(true);
 }
}
