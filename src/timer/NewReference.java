package timer;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class NewReference  extends JPanel{

    private List<Box> cells;

    private AppCalendar referenceCalendar;
    public NewReference(AppCalendar myCalendar){
        referenceCalendar = myCalendar;
        setSize(300, 200);
        setLayout(new GridLayout(7,7));
        setWeekNames();
        cells = new ArrayList<Box>();
        int day=0;
        for(int i=0;i<42;i++){
            if(day>=31)day=0;
            Box cell= new Box(0, 0);
            cells.add(cell);
             add(cell);
        }
        refreshCells();
    }

    public AppCalendar getReferenceCalendar() {
        return referenceCalendar;
    }

    public void setReferenceCalendar(AppCalendar referenceCalendar) {
        this.referenceCalendar = referenceCalendar;
    }

    public void refreshCells(){
        int celldate=0;
        int referenceDate = referenceCalendar.getDayOfMonth();

        for(int i=1;i<cells.size();i++){
            Box currentCell = cells.get(i);
             if(i>= referenceCalendar.getFirstWeekDayOfMonth()-1)currentCell.refreshCell(++celldate,referenceDate);
             else currentCell.refreshCell(0, referenceDate);
            if(celldate>= referenceCalendar.getNoOfDaysInMonth())celldate=0;
        }
    }

    private void setWeekNames(){

        add(new JLabel("Sun"));
        add(new JLabel("Mon"));
        add(new JLabel("Tue"));
        add(new JLabel("Wed"));
        add(new JLabel("Thu"));
        add(new JLabel("Fri"));
        add(new JLabel("Sat"));
    }
}
