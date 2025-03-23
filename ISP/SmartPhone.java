package ISP;

public interface SmartPhone extends Phone, WebBrowser, Camera{
    public void makeCall(String number);
    public void sendSMS(String number, String message);
    public void browseWeb(String url);
    public void takePicture();
}
