package ISP;

public class BasicPhone implements Phone{
    @Override
    public void makeCall(String number) {
        System.out.println("Basic phone is making a call to " + number);
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("Basic phone sending SMS to " + number + ": " + message);
    }
}
