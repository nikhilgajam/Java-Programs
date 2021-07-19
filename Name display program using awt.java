import java.awt.*;
import java.awt.event.*;

public class Jp{

	public static void main(String[] args) {

		System.out.println("Hello World");
		new Window();

	}

}


class Window{


	Button btn;
	Label lbl;
	TextField text;


	Window(){
		Frame w = new Frame("Hello");

		text = new TextField();
		text.setColumns(40);
		w.add(text);

		btn = new Button("Click Me");
		btn.addActionListener(e -> show());
		w.add(btn);

		lbl = new Label("Enter Your Name And Click That Button");
		w.add(lbl);

		// To close the window
		w.addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent e){
					System.exit(0);
				}
			}
		);

		w.setLayout(new FlowLayout());
		w.setSize(400, 400);
		w.setLocationRelativeTo(null);
		w.setVisible(true);

	}

	private void show(){

		String name = text.getText();
		lbl.setText("Hello " + name);

	}

}
