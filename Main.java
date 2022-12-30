package HW2;

public class Main {

    public static void main(String[] args) {
        JsonWriteFile enter = new JsonWriteFile();
        enter.writer();
        XmlWriteFile enter1 = new XmlWriteFile();
        enter1.writer();
        TxtWriteFile enter2 = new TxtWriteFile();
        enter2.writer();
    }
}