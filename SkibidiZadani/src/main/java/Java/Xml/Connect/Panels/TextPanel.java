package Java.Xml.Connect.Panels;

import javax.swing.*;
import java.awt.*;

public class TextPanel extends JTextPane{
    Font font = new Font("Serif",Font.ITALIC,36);

    public TextPanel(){

        setVisible(true);
        setBackground(Color.pink);
        setFont(font);
        setText("skibidi rizzlibear");
    }

    @Override
    public boolean isEditable() {
        return false;
    }

}
