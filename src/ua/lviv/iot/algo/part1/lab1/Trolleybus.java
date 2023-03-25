package ua.lviv.iot.algo.part1.lab1;

    import lombok.*;

    @Setter
    @Getter
    @ToString(includeFieldNames = true)
    //@NoArgsConstructor
    @RequiredArgsConstructor
    @AllArgsConstructor

public class Trolleybus {
    private int id = 100;
    private int routeNumber;
    private String currentStop;
    private final int maxSpeed = 50;
    private int currentSpeed;
    private final int capacity = 60;
    private int passengers = 0;
    private static Trolleybus instance = new Trolleybus();


    public void resetSpeed() {
        setCurrentSpeed(0);
        System.out.println("reset speed to 0");
    }

    public String stop() {
        resetSpeed();
        return getCurrentStop();
    }

    public int addPassenger() {
        if (getPassengers() != capacity) {
            setPassengers(getPassengers() + 1);
            return getPassengers();
        } else {
            System.out.println("it is too crowded");
            return getPassengers();
        }
    }

    public int removePassenger() {
        if (getPassengers() != 0) {
            setPassengers(getPassengers() - 1);
            return getPassengers();
        } else {
            System.out.println("it is empty");
            return getPassengers();
        }
    }

    public static Trolleybus getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        Trolleybus trolleybus1 = new Trolleybus();
        Trolleybus trolleybus2 = new Trolleybus(2352, 25, "Park", 45, 12);
        Trolleybus trolleybus3 = getInstance();
        Trolleybus trolleybus4 = getInstance();

        Trolleybus trolleybusThatWorkToday[] = new Trolleybus[]{trolleybus1, trolleybus2, trolleybus3, trolleybus4};
        int i = 0;
        while (i < trolleybusThatWorkToday.length) {
            System.out.println("id"+i+": "+trolleybusThatWorkToday[i].getId()+"\n");
            i++;
        }

    }

}
