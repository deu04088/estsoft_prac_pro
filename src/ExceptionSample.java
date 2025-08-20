import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionSample {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new FileReader("sample"));
            br.readLine();
            br.close();
        } catch (IOException e) {
            System.out.println("error message: " +  e.getMessage());
        }

    }
}
