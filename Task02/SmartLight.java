package Lab08_Tasks.Task02;

public class SmartLight implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Smart Light is turned ON.");
    }
    @Override
    public void turnOff() {
        System.out.println("Smart Light is turned OFF.");
    }
}
