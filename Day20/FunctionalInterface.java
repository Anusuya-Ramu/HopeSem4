package Day20;
import java.util.*;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class FunctionalInterface {
    public static void main(String[] arg){
        Predicate<Integer> iseven = n -> n % 2 == 0;
        System.out.println(iseven.test(10));//true or false return pannum
        System.out.println(iseven.test(7));

        Consumer<String> v= name -> System.out.println(name);
        v.accept("Rahul");

        Supplier<Double> val= ()-> Math.random();
        System.out.print(val);// hexca decimal code
        System.out.println(val.get());// random number return pannum

        Predicate<Integer> p = n-> n%2==0;
        Consumer<Integer> c= n-> System.out.print(n);
        Supplier<Integer> val=() -> 101;
        if(p.test(val.get())){
            val.accept(value.get());
        }else{
            System.out.println("Supplier cant be printed");
        }

    }
}

