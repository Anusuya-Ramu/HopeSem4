package Day21;
import java.util.*;
public class StreamPrint {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        for(int i: numbers){
            System.out.println(i);
        }
        numbers.stream().forEach(n -> System.out.println(n));

        System.out.println("even numbers");
        numbers.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));
        System.out.println("odd numbers");
        numbers.stream().filter(n -> n % 2 != 0).forEach(n -> System.out.println(n));//.forEach(System.out::println) method reference use panni print panalam

        System.out.println("squared numbers");
        numbers.stream().map(n -> n * n).forEach(n -> System.out.println(n));

        System.out.println("map with filter");
        numbers.stream().filter(n -> n % 2 == 0).map(n -> n * n).forEach(n -> System.out.println(n));

        System.out.println("reduce (accumulating) to find sum and product");
        int sum = numbers.stream().filter(n -> n % 2 == 0).map(n -> n * n).reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);


        System.out.println("sum in single line without storing in variable");
        System.out.println(numbers.stream().filter(n -> n % 2 == 0).map(n -> n * n).reduce(0, Integer::sum));


        int product = numbers.stream().filter(n -> n % 2 == 0).map(n -> n * n).reduce(1, (a, b) -> a * b);
        System.out.println("Product: " + product);

        System.out.println("accumulatoin using comparator");
        Optional<Integer> sum1 = numbers.stream().filter(n -> n % 2 == 0).map(n -> n * n).max(Integer::compareTo);
        System.out.println("Max: " + sum1.orElse(0));

        System.out.println("sorted numbers");
        numbers.stream().sorted().forEach(n -> System.out.println(n));
    }
}
