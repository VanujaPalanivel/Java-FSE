import java.util.HashMap;
import java.util.Scanner;

public class StudentDirectory {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many students do you want to add?");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.print("Enter Student ID (Integer): ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();
            studentMap.put(id, name);
        }

       
        System.out.print("\nEnter an ID to retrieve the student name: ");
        int searchId = scanner.nextInt();
        String result = studentMap.get(searchId);

        if (result != null) {
            System.out.println("Student Name: " + result);
        } else {
            System.out.println("Student ID not found.");
        }

        scanner.close();
    }
}
