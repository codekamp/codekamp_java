import javax.swing.*;

/**
 * Created by cerebro on 12/02/16.
 */
public class Game {

    public static void main(String[] args) {
        JFrame window1 = new JFrame();
        window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        TicTacToeScreen screen = new TicTacToeScreen();

        screen.button00.addActionListener(screen);
        screen.button01.addActionListener(screen);
        screen.button02.addActionListener(screen);
        screen.button10.addActionListener(screen);
        screen.button11.addActionListener(screen);
        screen.button12.addActionListener(screen);
        screen.button20.addActionListener(screen);
        screen.button21.addActionListener(screen);
        screen.button22.addActionListener(screen);
        screen.resetButton.addActionListener(screen);

        window1.setContentPane(screen.panel1);

        window1.pack();
        window1.setVisible(true);
    }
}
