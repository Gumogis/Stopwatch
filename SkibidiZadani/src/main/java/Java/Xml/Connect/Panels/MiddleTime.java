package Java.Xml.Connect.Panels;

import Java.Xml.Connect.MillisList.MillisList;
import Java.Xml.Connect.TimeConvertor.TimeConvertor;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class MiddleTime extends JTable {
    private DefaultTableModel dtm;

    public MiddleTime(MillisList millisList) {
        dtm = new DefaultTableModel();
        dtm.setRowCount(millisList.getList().size());
        dtm.setColumnCount(1);
        setModel(dtm);
        for(int i = 0; i < millisList.getList().size(); i++) {
            setValueAt(TimeConvertor.ConvertTime(millisList.getList().get(i)),i,0);
        }
    }

    public boolean isCellEditable(int row, int column) {
            return false;
    }

    public void update(MillisList millisList){
        dtm.setRowCount(millisList.getList().size());
        setModel(dtm);
        for(int i = 0; i < millisList.getList().size(); i++) {
            setValueAt(TimeConvertor.ConvertTime(millisList.getList().get(i)),i,0);
        }
    }
}
