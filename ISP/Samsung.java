package ISP;

public class Samsung implements SmartPhone {
    @Override
    public void makeCall(String number) {
        System.out.println("Samsung is making a call to " + number);
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("Samsung is sending SMS to " + number + ": " + message);
    }

    @Override
    public void browseWeb(String url) {
        System.out.println("Samsung is browsing to " + url);
    }

    @Override
    public void takePicture() {
        System.out.println("Samsung taking picture");
    }
}