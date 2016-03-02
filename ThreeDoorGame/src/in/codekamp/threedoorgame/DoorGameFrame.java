package in.codekamp.threedoorgame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by cerebro on 01/03/16.
 */
public class DoorGameFrame extends JFrame implements ActionListener, DoorOpenListner {

    private JPanel mainPanel;
    private JButton resetButton;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JLabel resultLabel;

    private Door door1;
    private Door door2;
    private Door door3;

    private int score = 200;
    private static final String WINDOW_TITLE = "CodeKamp Three Door Game";

    public DoorGameFrame() {
        super(WINDOW_TITLE);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(this.mainPanel);

        this.door1 = new Door();
        this.door2 = new Door();
        this.door3 = new Door();

        this.door1.setDoorOpenListner(this);
        this.door2.setDoorOpenListner(this);
        this.door3.setDoorOpenListner(this);

        this.panel1.add(door1);
        this.panel2.add(door2);
        this.panel3.add(door3);

        this.hideTreasure();

        this.resetButton.addActionListener(this);

        this.pack();
    }

    public void treasureFound(Boolean treasureFound) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.door1.close();
        this.door2.close();
        this.door3.close();

        this.hideTreasure();
    }

    private void hideTreasure() {
        this.door1.setTreasure(false);
        this.door2.setTreasure(false);
        this.door3.setTreasure(false);

        Random random = new Random();
        int randomInt = random.nextInt(3);

        if(randomInt == 0) {
            this.door1.setTreasure(true);
        } else if(randomInt == 1) {
            this.door2.setTreasure(true);
        } else {
            this.door3.setTreasure(true);
        }
    }

    @Override
    public void doorOpened(Boolean treasureFound) {
        if(treasureFound) {
            this.score += 20;
        } else {
            this.score -= 15;
        }

        this.resultLabel.setText(Integer.toString(this.score));

        this.door1.open();
        this.door2.open();
        this.door3.open();
    }
}
