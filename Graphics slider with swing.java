import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;


public class Jp{

    public static void main(String[] args){

        new Gui();

    }

}

class Gui extends JFrame{

    JSlider slider;
    JLabel label;
    Draw draw_panel;

    public Gui(){

        draw_panel = new Draw();
        label = new JLabel("Graphics Slider");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setToolTipText("Drag the slider");
        slider = new JSlider(SwingConstants.HORIZONTAL, 0, 400, 11);
        slider.setMajorTickSpacing(11);
        slider.setPaintTicks(true);

        /* (e -> slider.getValue()) This is also valid because the ChangeListener is functional method so we can use lambda */
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                draw_panel.setVar(slider.getValue());
            }
        });

        add(label, BorderLayout.NORTH);
        add(slider, BorderLayout.SOUTH);
        add(draw_panel, BorderLayout.CENTER);

        // Add the window settings after the widgets

        setTitle("Graphics Draw");
        setLocationRelativeTo(null);
        setVisible(true);
        setSize(500, 500);

    }

}

class Draw extends JPanel{

    private int var = 6;

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        setBackground(Color.ORANGE);

        g.setColor(Color.BLACK);
        g.fillOval(11, 11, var, var);

    }

    public void setVar(int x){
        var = (x >=0 ? x : 6);
        repaint();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(400, 400);
    }

    public Dimension getMinimumSize(){
        return getPreferredSize();
    }

}