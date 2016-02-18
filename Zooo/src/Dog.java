/**
 * Created by cerebro on 04/02/16.
 */
public class Dog extends Animal {

    public String breed;
    public String color;
    public int age;

    public static void describeYourself() {
        System.out.println("The most faithful animal");
    }

    public Dog(String name, String breed, int age) {
        super(name);

        this.breed = breed;
        this.age = age;

    }

    public Dog(String name, String breed, String color) {
        super(name);

        this.breed = breed;
        this.color = color;
    }

    public void bark() {

        System.out.println("Wuff Wuff. I am " + this.name);
    }

    public void introduceYourself() {

        System.out.println("My name is " + this.name + " and I am a Dog");
    }
}
