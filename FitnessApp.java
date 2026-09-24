import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FitnessApp {
    public static void main(String[] args) {
        String fileName = "user_profile.txt";
        // User profile data
        String profile = "Name: Arun\n"
                       + "Age: 22\n"
                       + "Weight: 65 kg\n"
                       + "Height: 175 cm\n"
                       + "Fitness Goal: Weight Loss\n";
        // Writing profile data to the file
        try (FileOutputStream fos = new FileOutputStream(fileName)) {

            byte[] data = profile.getBytes();
            fos.write(data);
            System.out.println("User profile saved successfully.");
        } catch (IOException e) {
            System.out.println("Error while writing: " + e.getMessage());
        }
        // Reading profile data from the file
        try (FileInputStream fis = new FileInputStream(fileName)) {
            int ch;
            System.out.println("\nUser Profile:");
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println("Error while reading: " + e.getMessage());
        }
    }
}