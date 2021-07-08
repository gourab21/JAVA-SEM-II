/** Main.java **/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Main {
    JLabel l;
    Main() {
        JFrame f = new JFrame("Swing Pink");
        l = new JLabel("Gourab Das  20 | 88006", SwingConstants.CENTER);
        l.setBounds(0, 0, 500, 200); /**** x,y,width,height ****/
        f.add(l);
        f.getContentPane().setBackground(Color.PINK);
        f.setSize(500,200);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main();
            }
        });
    }
}