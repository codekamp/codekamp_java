import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

/**
 * Created by cerebro on 19/02/16.
 */
public class CodeKampPanel extends JPanel implements KeyListener, MouseListener {

    public int playerXCord = 300;
    public int playerYCord = 315;
    public int playerYVel = 0;
    public int playerYAcc = 0;
    public int blockXCord = 700;
    public int blockYCord = 355;
    public boolean blockVisible = true;
    public BufferedImage grassImage = null;
    public BufferedImage playerImage = null;
    public BufferedImage blockImage = null;
    public boolean isRunning = true;
    public boolean isGameOver = false;


    @Override
    public void paint(Graphics g) {
        super.paint(g);

        if (isGameOver) {
            g.setColor(Color.RED);
            g.drawString("Game Over", 200, 400);
        } else {

            g.setColor(Color.blue);
            g.fillRect(0, 0, 800, 450);

            if (grassImage != null) {
                g.drawImage(grassImage, 0, 405, null);
            }

            if (playerImage != null) {
                g.drawImage(playerImage, playerXCord, playerYCord, null);
            }

            if (blockImage != null && this.blockVisible) {
                g.drawImage(blockImage, blockXCord, blockYCord, null);
            }

            g.setColor(Color.yellow);
            g.fillRect(700, 10, 50, 50);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE && this.playerYCord == 315) {
            this.playerYVel = -20;
            this.playerYAcc = 1;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        int xCordOfCLick = e.getX();
        int yCordOfCLick = e.getY();

        if (xCordOfCLick > 700 && xCordOfCLick < 750 && yCordOfCLick > 10 && yCordOfCLick < 60) {
            this.isRunning = !this.isRunning;
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
