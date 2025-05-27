import java.util.*;
import java.util.stream.Collectors;

public class StreamEvenFilterExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(101, 153, 120, 235, 340, 375, 480);

                List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());

               System.out.println("Even Numbers: " + evenNumbers);
    }
}
