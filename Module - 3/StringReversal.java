import java.util.Scanner;
class StringReversal {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        StringBuilder reversed = new StringBuilder(input);
        reversed.reverse();
        System.out.println("Reversed string (using StringBuilder): " + reversed);

        String reverseLoop = "";
        for (int i = input.length() - 1; i >= 0; i--) {
        reverseLoop += input.charAt(i);
        }

        System.out.println("Reversed string (using loop): " + reverseLoop);

        scanner.close();
    }
}
