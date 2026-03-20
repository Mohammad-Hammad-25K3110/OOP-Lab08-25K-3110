package Lab08_Tasks.Task02;

public class SmartFan implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Smart Fan is turned ON.");
    }
    @Override
    public void turnOff() {
        System.out.println("Smart Fan is turned OFF.");
    }
}
