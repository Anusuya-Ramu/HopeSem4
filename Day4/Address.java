package Day4;

public class Address {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        double [] arr1 = {1.5, 2.5, 3.5, 4.5, 5.5};
        int [] arr2 = arr; // arr3 is a reference to the same array as arr
        arr[0]=10;
        arr2[1]=20;
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr1);//sop(arr2.hashCode()) print only number (memory address)
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr[1]);
        System.out.println(arr.toString().substring(3));
        //int[] newRef=new int[arr];
        //System.out.println(newRef);
        String[] s={"Hello", "World"};
        System.out.println(s.toString().substring(3));
        System.out.println(Double.toHexString(arr1.hashCode()));
        float[] arr3 = {1.5f, 2.5f, 3.5f, 4.5f, 5.5f};
        System.out.println(Float.toHexString(arr3.hashCode()));
       // char[] arr4 = {'a', 'b', 'c', 'd', 'e'};
        //System.out.println(Character.toHexString(arr4.hashCode()));
        
    }
}
