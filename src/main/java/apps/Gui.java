package apps;

import javax.swing.*;
import java.awt.*;

public class Gui extends JComponent {

    public void paintComponent(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawLine(0, 0, 200, 200);
    }
}
