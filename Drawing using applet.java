import java.awt.*;
import java.applet.Applet;

/*
 <applet code="Jp" width=400 height=400></applet> create a new html
 compile the code using javac command
 type: appletviewer some.html
*/

public class Jp extends Applet{

	public void paint(Graphics g){

		g.drawOval(75, 75, 75, 75);
		g.drawArc(0, 0, 100, 100, 40, 50);
		g.drawLine(0, 0, 400, 400);

		g.fillRect(0, 0, 100, 60);
		g.fillOval(90, 90, 10, 10);

		g.setColor(Color.ORANGE);
		g.drawString("Hello World", 100, 100);

	}

}