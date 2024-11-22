package FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class _FileReader {
    public static void main(String[] args) {
        int count = 0;
        try (FileReader fr = new FileReader("output.txt")) {
            String data = "";
            while (true) {

                int x = fr.read();
                if (x == -1) {
                    break;
                } else if (x == ' ' || x == '.') {
                    count++;
                }

                // data = data + (char) x;
                // System.out.println(data);
            }

            int avg;
            int sum = 0;
            int x = fr.read();
            while (x != -1) {
                int c = 0;
                if (x < ' ') {
                    c++;
                }

                sum += c;

            }

            avg = sum / count;

            System.out.println(avg);
        } catch (IOException e) {

            e.printStackTrace();
        }

    }
}
