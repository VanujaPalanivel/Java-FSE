import java.util.*;
class LambdaSortExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("pocky");
        names.add("ravi");
        names.add("renu");
        names.add("ram");

        
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));

        System.out.println("Sorted list:");
        for (String name : names) {
        System.out.println(name);
        }
    }
}
