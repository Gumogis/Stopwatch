package Java.Xml.Connect.Panels;

import Java.Xml.Connect.MillisList.MillisList;
import Java.Xml.Connect.StopWatch.StopWatch;
import Java.Xml.Connect.TimeConvertor.TimeConvertor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private StopWatch stopky;
    private final TextPanel cas;
    private final MiddleTime MiddleTable;
    private MillisList millisList;
    private final JButton Start;
    private final JButton Stop;
    private final JButton Mezicas;
    private final JPanel tlacitka;
    public MainFrame(){

        stopky = new StopWatch();
        millisList = new MillisList();

        setTitle("PRO1");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
        setMinimumSize(new Dimension(100,100));
        setLayout(new BorderLayout());

        cas = new TextPanel();
        add(cas,BorderLayout.CENTER);
        MiddleTable = new MiddleTime(millisList);
        add(MiddleTable,BorderLayout.EAST);
        Start = new JButton();
        Start.setSize(new Dimension(300,300));
        Start.setText("Skibidi click");
        Stop = new JButton();
        Stop.setText("Skibidi Stop");
        Mezicas = new JButton();
        Mezicas.setText("Skibidi Middle");
        tlacitka = new JPanel();
        tlacitka.add(Start);
        tlacitka.add(Stop);
        tlacitka.add(Mezicas);
        add(tlacitka,BorderLayout.NORTH);

        Start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stopky.start();
            }
        });

        Stop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stopky.stop();
            }
        });

        Mezicas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cas.setText(TimeConvertor.ConvertTime(stopky.getElapsedTime()));
                millisList.addValueToList(stopky.getElapsedTime());
                MiddleTable.update(millisList);
            }
        });


    }
}
