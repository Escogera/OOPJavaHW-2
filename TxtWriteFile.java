package HW2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TxtWriteFile {
    public void writer() {
        Map<String, Double> studentsList = new HashMap<>();
        studentsList.put("Иван", 4.8);
        studentsList.put("Мария", 5.0);
        studentsList.put("Степан", 3.6);
        try (FileWriter writer = new FileWriter("output2.txt")) {

            for (Map.Entry<String, Double> item : studentsList.entrySet()) {
                writer.write(String.format("%s= %.1f,\n", item.getKey(), item.getValue()));
            }

        } catch (IOException ex) {
            System.err.println(ex.toString());
        }
    }
}
