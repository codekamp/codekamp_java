import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 12/02/16.
 */
public class TicTacToeScreen implements ActionListener {
    public JPanel panel1;
    public JButton button02;
    public JButton button10;
    public JButton button11;
    public JButton button12;
    public JButton button20;
    public JButton button21;
    public JButton button22;
    public JButton button00;
    public JButton button01;
    public JLabel resultLabel;
    public JButton resetButton;

    public int turn = 0;

    @Override
    public void actionPerformed(ActionEvent e) {
        this.turn++;

        Object source = e.getSource();

        if (source instanceof JLabel) {
            JLabel theClickedLabel = (JLabel)source;
            //write code to show history of scores.
        } else if (source instanceof JButton) {


            JButton theClickedButton = (JButton) source;

            if (theClickedButton == this.resetButton) {
                this.resetGame();
            } else {
                theClickedButton.setEnabled(false);

                if ((this.turn % 2) == 0) {
                    theClickedButton.setText("0");
                    if (hasPlayerWon("0")) {
                        this.disableAllbuttons();
                        this.resetButton.setVisible(true);
                        this.resultLabel.setText("Player 0 won!");
                        return;
                    }
                } else {
                    theClickedButton.setText("X");
                    if (hasPlayerWon("X")) {
                        this.disableAllbuttons();
                        this.resetButton.setVisible(true);
                        this.resultLabel.setText("Player X won!");
                        return;
                    }
                }

                if (this.turn == 9) {
                    this.resultLabel.setText("Match draw!");
                    this.resetButton.setVisible(true);
                }
            }
        }
    }


    private boolean hasPlayerWon(String symbol) {
        if ((this.button00.getText() == symbol) && (this.button01.getText() == symbol) && (this.button02.getText() == symbol)) {
            return true;
        }

        if ((this.button10.getText() == symbol) && (this.button11.getText() == symbol) && (this.button12.getText() == symbol)) {
            return true;
        }

        if ((this.button20.getText() == symbol) && (this.button21.getText() == symbol) && (this.button22.getText() == symbol)) {
            return true;
        }

        if ((this.button00.getText() == symbol) && (this.button11.getText() == symbol) && (this.button22.getText() == symbol)) {
            return true;
        }

        if ((this.button02.getText() == symbol) && (this.button11.getText() == symbol) && (this.button20.getText() == symbol)) {
            return true;
        }

        if ((this.button00.getText() == symbol) && (this.button10.getText() == symbol) && (this.button20.getText() == symbol)) {
            return true;
        }

        if ((this.button01.getText() == symbol) && (this.button11.getText() == symbol) && (this.button21.getText() == symbol)) {
            return true;
        }

        if ((this.button02.getText() == symbol) && (this.button12.getText() == symbol) && (this.button22.getText() == symbol)) {
            return true;
        }

        return false;
    }

    private void disableAllbuttons() {
        this.button00.setEnabled(false);
        this.button01.setEnabled(false);
        this.button02.setEnabled(false);
        this.button10.setEnabled(false);
        this.button11.setEnabled(false);
        this.button12.setEnabled(false);
        this.button20.setEnabled(false);
        this.button21.setEnabled(false);
        this.button22.setEnabled(false);
    }

    private void resetGame() {
        this.button00.setText("");
        this.button01.setText("");
        this.button02.setText("");
        this.button10.setText("");
        this.button11.setText("");
        this.button12.setText("");
        this.button20.setText("");
        this.button21.setText("");
        this.button22.setText("");

        this.resultLabel.setText("");

        this.button00.setEnabled(true);
        this.button01.setEnabled(true);
        this.button02.setEnabled(true);
        this.button10.setEnabled(true);
        this.button11.setEnabled(true);
        this.button12.setEnabled(true);
        this.button20.setEnabled(true);
        this.button21.setEnabled(true);
        this.button22.setEnabled(true);

        this.turn = 0;

        this.resetButton.setVisible(false);
    }
}
