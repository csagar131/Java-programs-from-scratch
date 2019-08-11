import java.awt.*;
class MyAwtProg extends Frame
{
  Label l1,l2;
  TextField t1,t2;
  Button b1,b2;
  public MyAwtProg()
  {
   l1=new Label("Enter Email");
   l2=new Label("Enter Password");
   t1=new TextField(20);
   t2=new TextField(20);
   t2.setEchoChar('*');
   b1=new Button("Save");
   b2=new Button("Reset");
   setSize(400,200);
   setBackground(Color.red);
   setLayout(new FlowLayout());
   setLocationRelativeTo(this);
	add(l1);add(t1);add(l2);add(t2);add(b1);add(b2);
  }
 public static void main(String args[])
 {
  MyAwtProg s=new MyAwtProg();
  s.setVisible(true);
 }
}
  
   
 