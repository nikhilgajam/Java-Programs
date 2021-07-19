import java.awt.*;
import java.awt.event.*;

public class Jp{

	public static void main(String[] args){

		new GUI();

	}

}

class GUI{

	Label lbl;

	GUI(){

		Frame w = new Frame("Mouse And Keyboard Events");

		lbl = new Label("Welcome");
		w.add(lbl);
		w.setVisible(true);
		w.setSize(100, 100);
		w.setLocationRelativeTo(null);

		// To close the window
		w.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		// MouseListener Methods
		lbl.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl.setText("Mouse Clicked");
			}

			@Override
			public void mousePressed(MouseEvent e) {
				lbl.setText("Mouse Pressed");
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				lbl.setText("Mouse Released");
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				lbl.setText("Mouse Entered");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lbl.setText("Mouse Exited");
			}
		});

		// KeyListener Methods
		w.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				lbl.setText("Key Typed");
			}

			@Override
			public void keyPressed(KeyEvent e) {
				lbl.setText("Key Pressed");
			}

			@Override
			public void keyReleased(KeyEvent e) {
				lbl.setText("Key Released");
			}
		});

		// MouseMotionListener Methods
		lbl.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				lbl.setText("Mouse Dragged");
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				lbl.setText("Mouse Moved");
			}
		});

	}

}
