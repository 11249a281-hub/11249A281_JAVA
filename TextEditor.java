
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class TextEditor {
    public static void main(String[] args) {

        String fileName = "editor.txt";
        String content = "Welcome to the Text Editor!\n"
                       + "This file is created using FileWriter.\n"
                       + "The content is read using FileReader.";

        // Writing content to the file
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            System.out.println("Content written successfully.");
        } catch (IOException e) {
            System.out.println("Error while writing: " + e.getMessage());
        }

        // Reading content from the file
        try (FileReader reader = new FileReader(fileName)) {
            int ch;

            System.out.println("\nFile Content:");

            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

        } catch (IOException e) {
            System.out.println("Error while reading: " + e.getMessage());
        }
    }
}

