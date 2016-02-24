/**
 * Created by cerebro on 22/02/16.
 */
public class Demo {

    public static void main(String[] args) {

        try {
            Demo.makeSandWicthes();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (OutOfBalanceException e) {
            System.out.println(e.getMessage());
        } catch (LimitCrossedException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void makeSandWicthes() throws Exception {

            UserNotifier.bringBread();



    }
}
