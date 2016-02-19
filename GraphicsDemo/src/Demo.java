import com.sun.org.apache.bcel.internal.classfile.Code;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.net.URL;

/**
 * Created by cerebro on 19/02/16.
 */
public class Demo {

    public static void main(String[] args) {

        JFrame frame1 = new JFrame();
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CodeKampPanel panel1 = new CodeKampPanel();
        panel1.setPreferredSize(new Dimension(800, 450));

        frame1.setContentPane(panel1);
        frame1.pack();
        frame1.setResizable(false);
        frame1.setVisible(true);

        //code for loading image from URL
//        try {
//            URL url = new URL("IMAGE_URL_HERE");
//            panel1.image = ImageIO.read(url);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

        try {
            panel1.playerImage = ImageIO.read(Demo.class.getResourceAsStream("/run_anim1.png"));
            panel1.grassImage = ImageIO.read(Demo.class.getResourceAsStream("/grass.png"));
            panel1.repaint();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        int count = 0;
        while (true) {
            count++;
            count = count % 8;

            try {

                switch (count) {
                    case 0:
                        panel1.playerImage = ImageIO.read(Demo.class.getResourceAsStream("/run_anim1.png"));
                        break;
                    case 1:
                        panel1.playerImage = ImageIO.read(Demo.class.getResourceAsStream("/run_anim2.png"));
                        break;
                    case 2:
                        panel1.playerImage = ImageIO.read(Demo.class.getResourceAsStream("/run_anim3.png"));
                        break;
                    case 3:
                        panel1.playerImage = ImageIO.read(Demo.class.getResourceAsStream("/run_anim4.png"));
                        break;
                    case 4:
                        panel1.playerImage = ImageIO.read(Demo.class.getResourceAsStream("/run_anim5.png"));
                        break;
                    case 5:
                        panel1.playerImage = ImageIO.read(Demo.class.getResourceAsStream("/run_anim4.png"));
                        break;
                    case 6:
                        panel1.playerImage = ImageIO.read(Demo.class.getResourceAsStream("/run_anim3.png"));
                        break;
                    case 7:
                        panel1.playerImage = ImageIO.read(Demo.class.getResourceAsStream("/run_anim2.png"));
                        break;
                }

                panel1.repaint();
                Thread.sleep(15);
            } catch (Exception e) {

            }
        }

//        int xVel = 1;
//        int yVel = 1;
//        while (true) {
//            panel1.xCord = panel1.xCord + xVel;
//            panel1.yCord = panel1.yCord + yVel;
//
//            if(panel1.yCord > 400) {
//                panel1.yCord = 400;
//                yVel = -1;
//            }
//
//            if(panel1.xCord > 750) {
//                panel1.xCord = 750;
//                xVel = -1;
//            }
//
//            if(panel1.yCord < 0) {
//                panel1.yCord = 0;
//                yVel = 1;
//            }
//
//            if(panel1.xCord < 0) {
//                panel1.xCord = 0;
//                xVel = 1;
//            }
//
//            panel1.repaint();
//
//            try {
//                Thread.sleep(3);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
    }
}
