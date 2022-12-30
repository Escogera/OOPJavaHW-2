package HW2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class JsonWriteFile extends WriteFile {

    public void writer() {
        Map<String, Double> studentsList = new HashMap<>();
        studentsList.put("Иван", 4.8);
        studentsList.put("Мария", 5.0);
        studentsList.put("Степан", 3.6);
        try (FileWriter writer = new FileWriter("output.json")) {
            writer.write("{\n");
            for (Map.Entry<String, Double> item : studentsList.entrySet()) {
                writer.write(String.format("\t\"%s\": \"%.1f, \n", item.getKey(), item.getValue()));               
                

            }
            writer.write("}\n");

        } catch (IOException ex) {
            System.err.println(ex.toString());
        }

    }

}
