import java.awt.*;
import java.awt.event.*;

public class SimpleEvent extends Frame implements ActionListener {
    Button b = new Button("Click");
    Label l = new Label("Waiting...");

    SimpleEvent() {
        setLayout(new FlowLayout());
        add(b); add(l);
        b.addActionListener(this);

        setSize(200, 100);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { dispose(); }
        });
    }

    public void actionPerformed(ActionEvent e) {
        l.setText("Button Clicked!");
    }

    public static void main(String[] args) {
        System.out.println("Kumari Priya 079");
        new SimpleEvent();
    }
}
