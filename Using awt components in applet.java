import java.awt.*;
import java.applet.Applet;

/*
 <applet code="a" width=400 height=400>
 </applet>

 compile the code using javac command
 type: appletviewer some.html
*/

public class Jp extends Applet{

	Label lbl;
	TextField text;
	Button btn;

	public void init(){

		setBackground(Color.ORANGE);
		setForeground(Color.BLACK);
		lbl = new Label("Hey Enter Your Name In The Box");

		text = new TextField();
		text.setColumns(40);

		btn = new Button("Show");
		btn.addActionListener(e -> btn_clicked());


		add(lbl);
		add(text);
		add(btn);
//		setLayout(new GridLayout(3, 3));

	}

	public void btn_clicked(){
		lbl.setText("Hello " + text.getText());
	}

}
