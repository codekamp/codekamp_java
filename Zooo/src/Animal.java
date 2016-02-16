/**
 * Created by cerebro on 04/02/16.
 */
public class Animal {

    public Animal(String name) {

        super();

        this.name = name;
    }

    public String name;

    public void introduceYourself() {

        System.out.println("My name is " + this.name + " and I am an Animal");
    }
}
