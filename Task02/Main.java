package Lab08_Tasks.Task02;

public class Main {
    public static void main(String[] args) {
        SmartDevice light = new SmartLight();
        SmartDevice fan = new SmartFan();
        light.turnOn();
        light.turnOff();
        fan.turnOn();
        fan.turnOff();
    }
}
