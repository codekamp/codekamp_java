package in.codekamp.FileHandling;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.*;

/**
 * Created by cerebro on 28/03/16.
 */
public class Demo {
    public static void main(String[] args) {

        File file = new File("/Users/cerebro/Desktop");

        System.out.println(file.length());
        System.out.println(file.lastModified());
        System.out.println(file.exists());
        System.out.println(file.canWrite());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());

        File[] allFiles = file.listFiles();

        for(int i = 0; i < allFiles.length; i++) {
            System.out.println(allFiles[i].getName());
        }

    }
}
