package Task10;

public class AllFunctionInWrapperClass {

    public static void main(String[] args) {

        Integer a = Integer.valueOf(100);
        int b = a.intValue();

        System.out.println("Integer value: " + a);
        System.out.println("Primitive int: " + b);

        int num = Integer.parseInt("123");
        System.out.println("Parsed int: " + num);

        String str = Integer.toString(456);
        System.out.println("Integer to String: " + str);

        int result = Integer.compare(10, 20);
        System.out.println("Compare result: " + result);

        System.out.println("Max: " + Integer.max(10, 20));
        System.out.println("Min: " + Integer.min(10, 20));

        Double d = Double.valueOf(12.34);
        double dVal = d.doubleValue();

        System.out.println("Double value: " + d);
        System.out.println("Primitive double: " + dVal);

        double d2 = Double.parseDouble("45.67");
        System.out.println("Parsed double: " + d2);

        Character ch = Character.valueOf('A');

        System.out.println("Is Letter: " + Character.isLetter(ch));
        System.out.println("Is Digit: " + Character.isDigit(ch));
        System.out.println("Is UpperCase: " + Character.isUpperCase(ch));
        System.out.println("Is LowerCase: " + Character.isLowerCase(ch));
        System.out.println("To LowerCase: " + Character.toLowerCase(ch));
        System.out.println("To UpperCase: " + Character.toUpperCase(ch));

        Boolean bool = Boolean.valueOf("true");
        System.out.println("Boolean value: " + bool);

        Byte by = Byte.valueOf("10");
        System.out.println("Byte value: " + by);

        Short sh = Short.valueOf("20");
        System.out.println("Short value: " + sh);

        Long l = Long.valueOf("1000");
        System.out.println("Long value: " + l);

        Float f = Float.valueOf("12.5");
        System.out.println("Float value: " + f);

        Integer x = 100;
        Integer y = 100;
        System.out.println("Equals: " + x.equals(y));

        System.out.println("HashCode: " + x.hashCode());
    }
}
