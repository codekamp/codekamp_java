import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 16/02/16.
 */
public class MyWindow extends JFrame implements ActionListener {
    private JPanel panel1;
    private JLabel label;
    private JButton button;
    private MyWindow[] childWindows;
    private int childWindowCount = 0;

    public MyWindow() {
        super();

        this.childWindows = new MyWindow[100];


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(this.panel1);
        this.button.addActionListener(this);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        this.label.setForeground(Color.red);
    }
}
