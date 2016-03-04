package in.codekamp.threedoorgame;

import com.sun.org.apache.xpath.internal.operations.Bool;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by cerebro on 02/03/16.
 */
public class Door extends JPanel implements MouseListener {

    private BufferedImage doorImage;
    private BufferedImage treasureImage;
    private BufferedImage thulluImage;

    private boolean doorOpen = false;
    private boolean hasTreasure = false;
    private DoorOpenListner listner = null;

    private int result;

    public Door() {
        super();
        this.setPreferredSize(new Dimension(200, 300));

        try {
            this.doorImage = ImageIO.read(Door.class.getResource("door.png"));
            this.treasureImage = ImageIO.read(Door.class.getResource("treasure.png"));
            this.thulluImage = ImageIO.read(Door.class.getResource("thullu.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.addMouseListener(this);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        if (doorOpen) {
            if (hasTreasure) {
                g.drawImage(this.treasureImage, 0, 0, null);
            } else {
                g.drawImage(this.thulluImage, 0, 0, null);
            }

        } else {
            g.drawImage(this.doorImage, 0, 0, null);
        }
    }

    public void setTreasure(Boolean hasTreasure) {
        this.hasTreasure = hasTreasure;
    }

    public void open() {
        if(!this.doorOpen) {
            this.doorOpen = true;
            this.repaint();
        }
    }

    public void close() {
        if(this.doorOpen) {
            this.doorOpen = false;
            this.repaint();
        }
    }

    public void reset() {
        this.setTreasure(false);
        this.close();
    }

    public boolean isOpen() {
        return this.doorOpen;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (!this.doorOpen) {
            this.open();

            if (listner != null) {
                this.listner.doorOpened(this.hasTreasure);
            }
        }
    }

    public void setDoorOpenListner(DoorOpenListner listner) {
        this.listner = listner;
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //add hightlight code
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //remove highlight code
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
