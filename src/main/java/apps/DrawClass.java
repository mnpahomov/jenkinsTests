package apps;

import javax.swing.*;

public class DrawClass {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Draw");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Gui gui = new Gui();
        frame.add(gui);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
