package ISP;

public class Main {
    public static void main(String[] args) {

        Phone basicPhone = new BasicPhone();
        basicPhone.makeCall("+63 912 345 6789");
        basicPhone.sendSMS("+63 912 345 6789", "How r u?");
        
       
        SmartPhone samsung = new Samsung();
        samsung.makeCall("+63 912 345 6789");
        samsung.sendSMS("+63 998 765 4321", "Hello!!");
        samsung.browseWeb("https://www.neu.edu.ph");
        samsung.takePicture();
        
       
        SmartPhone iPhone = new IPhone();
        iPhone.makeCall("+63 998 765 4321");
        iPhone.sendSMS("+63 912 345 6789", "Meet me @");
        iPhone.browseWeb("https://www.neu.edu.ph");
        iPhone.takePicture();
    }
}