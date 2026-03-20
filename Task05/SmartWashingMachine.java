package Lab08_Tasks.Task05;

public class SmartWashingMachine extends Appliance implements RemoteControl{
    @Override
    public void start(){
        System.out.println("Washing Machine started.");
    }
    @Override
    public void controlRemotely(){
        System.out.println("Washing Machine is controlled remotely.");
    }
}
