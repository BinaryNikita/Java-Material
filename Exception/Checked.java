package Exception;
import java.io.*;
class GFG {
	public static void main(String[] args)
	{

		try (FileReader file = new FileReader("C:\\test\\a.txt")) {
            BufferedReader fileInput = new BufferedReader(file);
            for (int counter = 0; counter < 3; counter++)
            	System.out.println(fileInput.readLine());
            fileInput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}


