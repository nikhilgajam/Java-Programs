import java.awt.*;
import java.awt.event.*;

public class Jp{

	public static void main(String[] args){
		
		new GUI();

	}

}

class GUI{


	GUI(){

		Frame w = new Frame("All Components");

		// Label
		Label lbl = new Label("Welcome");
		w.add(lbl);

		// Button
		Button btn = new Button("Button");
		w.add(btn);

		// CheckBox
		Checkbox check = new Checkbox("A");
		w.add(check);

		// CheckBox Group
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox chb1 = new Checkbox("CheckBox1", cbg, true);
		Checkbox chb2 = new Checkbox("CheckBox2", cbg, false);
		w.add(chb1);
		w.add(chb2);

		// List
		List l = new List();
		l.add("Hello World");
		w.add(l);

		// TextField
		TextField t = new TextField("Text");
		w.add(t);

		// TextArea
		TextArea text = new TextArea("Hello World");
		w.add(text);

		// Choice
		Choice choice = new Choice();
		choice.add("Hello World");

		// Canvas
		Canvas c = new Canvas();
		w.add(c);

		// Menu
		MenuBar mb = new MenuBar();
		Menu menu = new Menu("Menu");
		MenuItem m = new MenuItem("Ok");
		menu.add(m);
		mb.add(menu);
		w.setMenuBar(mb);

		// Dialog
//		Dialog d = new Dialog(w, "Dialog", true);
//		d.add(lbl);
//		d.setVisible(true);

		// Scrollbar
		Scrollbar s = new Scrollbar();
		w.add(s);

		// To close the window
		w.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});

		w.setVisible(true);
		w.setSize(500, 500);
		w.setLayout(new FlowLayout());
		w.setLocationRelativeTo(null);

	}


}
