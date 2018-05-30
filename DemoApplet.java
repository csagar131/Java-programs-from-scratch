import java.applet.*;
/*<applet code=DemoApplet.class width=700 height=400>
</applet>*/
class DemoApplet extends Applet
{
 public void init()
 {
  System.out.println("init called");
 }
 public void start()
 {
  System.out.println("start called");
  }
 public void stop()
 {
  System.out.println("stop called");
  }
 public void destroy()
 {
  System.out.println("destroyed");
 }
}