package ua.lviv.iot.algo.part1.Building;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class SportComplexWriter {

    public void writeToFile(List<Stadium> stadiums){
    }

    public static void main(String... args) {
        List<SportComplex> sportComplexes = new LinkedList<>();
        sportComplexes.add(new Stadium(321, "asd", "gfd", "hjk", 551));
        sportComplexes.add(new Stadium(123, "zxc", "vbn", "mnb", 600));
        sportComplexes.add(new SwimmingPool());
        {
            try {
                FileOutputStream fos = new FileOutputStream("SportComplexes");
                ObjectOutputStream oos = new ObjectOutputStream(fos);

                oos.writeChars(new Stadium().getHeaders());
                for(SportComplex sportComplex : sportComplexes){
                    oos.writeChars(sportComplex.toCSV());
                }

                oos.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
