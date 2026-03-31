package Day10;

import java.io.FileReader;
import java.io.IOException;

public class checkedException {
  public static void main(String[] args) {
        try {
            FileReader f = new FileReader("file.txt");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
