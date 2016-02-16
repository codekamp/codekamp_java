import javax.swing.text.Style;

/**
 * Created by cerebro on 04/02/16.
 */
public class Cat extends Animal implements MTech {

    public static void describeYourself() {
        System.out.println("Billi, Sher ki mausi");
    }

    public Cat(String name) {
        super(name);
    }


    public String toString() {
        return "Name: " + this.name;
    }

    public void introduceYourself() {
        System.out.println("My name is " + this.name);
    }

    public void bunkLectures() {

    }

    public void nightOutBeforeExam() {

    }

    @Override
    public void doNothing() {

    }
}
