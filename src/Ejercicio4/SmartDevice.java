package Ejercicio4;

public class SmartDevice {
    protected String maker;
    protected String model;
    protected double screenSize;
    protected int batterySize;
    protected int batteryAutonomy;

    public SmartDevice(){
    }

    public SmartDevice(String maker, String model, double screenSize, int batterySize, int batteryAutonomy){
        this.maker = maker;
        this.model = model;
        this.screenSize = screenSize;
        this.batterySize = batterySize;
        this.batteryAutonomy = batteryAutonomy;
    }

    public String getMaker() {
        return maker;
    }

    public String getModel() {
        return model;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getBatteryAutonomy() {
        return batteryAutonomy;
    }
}
