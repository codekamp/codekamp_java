/**
 * Created by cerebro on 22/02/16.
 */
public class UserNotifier {

    public static int sentSms = 18;
    public static int balance = 0;


    public static void sendSMS(String msg, String mobileNum) throws LimitCrossedException, OutOfBalanceException {
        if (UserNotifier.sentSms >= 100) {

            LimitCrossedException exc = new LimitCrossedException();
            throw exc;
        }

        if(UserNotifier.balance <= 0) {
            throw new OutOfBalanceException();
        }

        System.out.println("SMS sent successfully");
    }

    public static void sendEmail(String msg, String subject, String email) {

    }

    public static void bringBread() throws Exception {
        throw new Exception("Dukkan band");
//        System.out.println("Bread mil gayi");
    }
}
