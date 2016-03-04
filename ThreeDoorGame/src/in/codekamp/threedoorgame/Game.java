package in.codekamp.threedoorgame;

/**
 * Created by cerebro on 02/03/16.
 */
public class Game implements DoorOpenListner {
    public static void main(String[] args) {
        DoorGameFrame frame = new DoorGameFrame();
        frame.setVisible(true);
    }

    @Override
    public void doorOpened(Boolean treasureFound) {

    }
}
