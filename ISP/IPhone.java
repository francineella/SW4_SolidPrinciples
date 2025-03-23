package ISP;

public class IPhone implements SmartPhone {
    @Override
    public void makeCall(String number) {
        System.out.println("iphone is making a call to " + number);
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("iPhone is sending SMS to " + number + ": " + message);
    }

    @Override
    public void browseWeb(String url) {
        System.out.println("iPhone is browsing to " + url);
    }

    @Override
    public void takePicture() {
        System.out.println("iPhone taking picture");
    }
}