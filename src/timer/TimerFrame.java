package timer;

import sun.awt.VerticalBagLayout;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

/**
 *
 */
public class TimerFrame extends JFrame {

    NewReference calenderBoard = new NewReference(new AppCalendar(new Date(System.currentTimeMillis())));
    TimerPanel referencePanel = new TimerPanel(calenderBoard);

    public TimerFrame() {
        Dimension frameDimension = new Dimension(300, 350);
        setLayout(new VerticalBagLayout());
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(frameDimension);
        setMinimumSize(frameDimension);
        setMaximumSize(frameDimension);
        add(referencePanel);
        add(calenderBoard);
        setLocation(250, 250);
        setTitle("Timer");
        setVisible(true);
    }

}
