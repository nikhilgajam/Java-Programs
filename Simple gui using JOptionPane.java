import javax.swing.JOptionPane;

public class Jp {

    public static void main(String[] args){

        // This is the easiest way to create simple gui in java

        System.out.println("JOptionPane");


        String a = JOptionPane.showInputDialog("Enter a number: ");
        String b = JOptionPane.showInputDialog("Enter another number: ");


        int sum = 0;

        try{

            sum = Integer.parseInt(a) + Integer.parseInt(b);

        }catch (Exception Ex){

            JOptionPane.showMessageDialog(null, "Enter numbers only", "Error", JOptionPane.PLAIN_MESSAGE);

            return;

        }

        JOptionPane.showMessageDialog(null, "Sum: " + sum, "Hello World",JOptionPane.PLAIN_MESSAGE);






    }



}
