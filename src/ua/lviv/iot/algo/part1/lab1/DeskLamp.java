package ua.lviv.iot.algo.part1.lab1;

public class DeskLamp {
    private boolean isOn;
    private int brightness;
    private String color;
    private String producer;

    public DeskLamp(boolean isOn, int brightness, String color, String producer) {
        this.isOn = isOn;
        this.brightness = brightness;
        this.color = color;
        this.producer = producer;
    }

    public DeskLamp(String producer) {
        this(false, 5, "white", producer);
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Lamp turned on");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Lamp turned off");
    }

    public void setBrightness(int value) {
        if (value >= 1 && value <= 10) {
            brightness = value;
            System.out.println("Lamp brightness set to " + value);
        } else {
            System.out.println("Invalid brightness value");
        }
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("Lamp color set to " + color);
    }

    public String getProducer() {
        return producer;
    }

    public static void main(String[] args) {
        DeskLamp a1 = new DeskLamp(false, 5, "white", "Producer 1");
        DeskLamp a2 = new DeskLamp(false, 6, "white", "Producer 2");
        DeskLamp a3 = new DeskLamp("Producer 3");
        DeskLamp a4 = new DeskLamp("Producer 4");

        DeskLamp[] deskLamps = {a1, a2, a3, a4};
        for (DeskLamp lamp : deskLamps) {
            System.out.println("Desk lamp producer: " + lamp.getProducer());
        }
    }
}
