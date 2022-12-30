package HW2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class XmlWriteFile {
    public void writer() {
        Map<String, Double> studentsList = new HashMap<>();
        studentsList.put("Иван", 4.8);
        studentsList.put("Мария", 5.0);
        studentsList.put("Степан", 3.6);
        try (FileWriter writer = new FileWriter("output1.xml")) {
            writer.write("<?xml version=\"1.0\"encoding=\"utf-8\" ?>\n");
            writer.write("<data>\n");
            for (Map.Entry<String, Double> item : studentsList.entrySet()) {

                writer.write("\t<student>\n");
                writer.write(String.format("\t\t<name/%s</name>\n", item.getKey()));
                writer.write(String.format("\t\t<grade/grade%.1f</grade>\n", item.getValue()));
                writer.write("\t</student>\n");
            }
            writer.write("</data>\n");
        } catch (IOException ex) {
            System.err.println(ex.toString());
        }
    }
}