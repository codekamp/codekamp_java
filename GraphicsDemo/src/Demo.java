

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

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
        panel1.setFocusable(true);
        panel1.requestFocus();

        panel1.addKeyListener(panel1);
        panel1.addMouseListener(panel1);

        try {
            panel1.playerImage = ImageIO.read(Demo.class.getResourceAsStream("/run_anim1.png"));
            panel1.grassImage = ImageIO.read(Demo.class.getResourceAsStream("/grass.png"));
            panel1.blockImage = ImageIO.read(Demo.class.getResourceAsStream("/block.png"));
            panel1.repaint();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        int count = 0;
        Random random = new Random();
        Rectangle playerRect;
        Rectangle blockRect;
        while (!panel1.isGameOver) {
            if(panel1.isRunning) {
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

                    panel1.playerYCord += panel1.playerYVel;
                    panel1.playerYVel += panel1.playerYAcc;

                    if (panel1.playerYCord >= 315) {
                        panel1.playerYCord = 315;
                        panel1.playerYAcc = 0;
                        panel1.playerYVel = 0;
                    }

                    panel1.blockXCord -= 5;

                    if(panel1.blockXCord < -20) {
                        panel1.blockXCord = 850;
                        if(random.nextInt(2) == 0) {
                            panel1.blockYCord = 355;
                        } else {
                            panel1.blockYCord = 280;
                        }
                        panel1.blockVisible = true;
                    }


                    playerRect = new Rectangle(panel1.playerXCord, panel1.playerYCord, 72, 90);
                    blockRect = new Rectangle(panel1.blockXCord, panel1.blockYCord, 20, 50);

                    if(panel1.blockVisible && playerRect.intersects(blockRect)) {
                        panel1.playerXCord -= 100;
                        panel1.blockVisible = false;
                    }

                    if (panel1.playerXCord < 0) {
                        panel1.isGameOver = true;
                    }

                    panel1.repaint();

                } catch (Exception e) {

                }


            }

            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
