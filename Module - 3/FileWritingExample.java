import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
class FileWritingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to write to the file: ");
        String userInput = scanner.nextLine();

        try {
           FileWriter writer = new FileWriter("output.txt");

           writer.write(userInput);

           writer.close();

            System.out.println("Data has been written to output.txt successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        scanner.close();
    }
}
