import java.applet.*;
import java.awt.*;
import java.awt.Graphics;  
public class myapplet extends Applet
{
	public void paint(Graphics g){  
		g.drawLine(20, 20, 200, 20);
		g.drawRect(20, 40, 200, 40);
		g.setColor(Color.RED);
		g.drawOval(200, 160, 200, 160);
		
		}  
	

}
 /* 
<applet code="myapplet.class" width="500" height="700" border="2"> 
</applet> 
*/  