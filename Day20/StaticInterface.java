package Day20;
import java.util.*;

interface CarEngine{
    static String Display(){
        return " engine is esigned with 3000rpm";
    }
}



public class StaticInterface{
    public static void main(String[] args){
        String s =CarEngine.Display();
        System.out.print(s);
    }
}