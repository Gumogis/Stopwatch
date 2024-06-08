package Java.Xml.Connect;

import Java.Xml.Connect.Panels.MainFrame;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->{
            try {
                new MainFrame();
            } catch (Exception e) {
                System.out.println("GUI ERROR: " + e);
                }
        });
    }
}