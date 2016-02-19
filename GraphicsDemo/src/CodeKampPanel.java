import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by cerebro on 19/02/16.
 */
public class CodeKampPanel extends JPanel {

    public int xCord = 150;
    public int yCord = 0;
    public BufferedImage grassImage = null;
    public BufferedImage playerImage = null;

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.blue);
        g.fillRect(0,0,800,450);

        if (grassImage != null) {
            g.drawImage(grassImage, 0, 405, null);
        }

        if (playerImage != null) {
            g.drawImage(playerImage, 300, 315, null);
        }
    }
}
