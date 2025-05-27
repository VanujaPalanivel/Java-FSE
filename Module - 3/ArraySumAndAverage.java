import java.util.Scanner;
class ArraySumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int numElements = scanner.nextInt();
        double[] elements = new double[numElements];

        System.out.println("Enter the elements:");
        for (int i = 0; i < numElements; i++) {
        System.out.print("Element " + (i + 1) + ": ");
        elements[i] = scanner.nextDouble();
        }

        double sum = 0;
        for (double num : elements) {
        sum += num;
        }

        double average = numElements > 0 ? sum / numElements : 0;

        
        System.out.println("\nSum of the elements: " + sum);
        System.out.println("Average of the elements: " + average);

        scanner.close();
    }
}
