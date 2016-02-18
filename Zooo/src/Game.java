import java.util.Random;

/**
 * Created by cerebro on 04/02/16.
 */
public class Game {

    public static void main(String[] args) {

        Animal animal2;


        animal2 = new Dog("Mars", "Bulldog", 23);
//        animal2 = new Cat("Venus");

        Dog dog1 = (Dog)animal2;

        dog1.bark();



//        Random randomGenerator = new Random();
//        int randomInt = randomGenerator.nextInt(4);

//        switch (randomInt) {
//            case 0:
//                animal2 = new Cat("Venus");
//                System.out.println("animal2 is a Cat");
//                break;
//            case 1:
//                animal2 = new Dog("Mercury", "bulldog", 10);
//                System.out.println("animal2 is a Dog");
//                break;
//            case 2:
//                animal2 = new Buffallo("Saturn");
//                System.out.println("animal2 is a Buffallo");
//                break;
//            case 3:
//                animal2 = new Elephant("Jumbo");
//                System.out.println("animal2 is a Elephant");
//                break;
//            default:
//                animal2 = new Animal("Afzal Guru");
//                System.out.println("animal2 is an animal");
//        }




    }
}
