import java.awt.*;
import java.applet.Applet;

/*
 <applet code="a" width=400 height=400>
    <param name="hello" value="world">
 </applet>

 compile the code using javac command
 type: appletviewer some.html
*/

public class Jp extends Applet{

	public void paint(Graphics g){

		g.drawString(getParameter("hello"), 40, 40);

	}

}
