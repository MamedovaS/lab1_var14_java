package ua.lviv.iot.algo.part1.Building;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class SportComplexWriter {

    public void writeToFile(List<SportComplex> sportComplexes) throws IOException {
        try (FileWriter writter = new FileWriter("SportComplexes.csv");) {

            for (SportComplex sportComplex : sportComplexes) {
                writter.write(sportComplex.getHeaders());
                writter.write("\n");
                writter.write(sportComplex.toCSV());
                writter.write("\n");
            }

        }
    }

    public static void main(String... args) throws IOException {
        List<SportComplex> sportComplexes = new LinkedList<>();
        sportComplexes.add(new Stadium(321, "asd", "gfd", "hjk", 551));
        sportComplexes.add(new Stadium(123, "zxc", "vbn", "mnb", 600));
        sportComplexes.add(new SwimmingPool());

        var writter = new SportComplexWriter();
        writter.writeToFile(sportComplexes);
    }
}
