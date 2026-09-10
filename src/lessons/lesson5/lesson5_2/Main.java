package lessons.lesson5.lesson5_2;

import java.io.File;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Properties properties = System.getProperties();

        for (Object property : properties.keySet()) {
            System.out.println(property + " - " + System.getProperty((String) property));
        }

        File homeDirectory = new File(System.getProperty("user.home"));
        if (homeDirectory.isDirectory()) {
            File[] files = homeDirectory.listFiles();
            if (files != null) {
                for (File file : files) {
                    System.out.println(file.getName());
                }
            }
        }

    }
}
