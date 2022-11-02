import java.io.File;

public class Main {
    public static void main(String[] args) {
        Iterable<String> items = new EmailLoader(new FileLoader(new File("emails.txt"))).items();
        for (String line : items)
            System.out.println(line);
    }
}