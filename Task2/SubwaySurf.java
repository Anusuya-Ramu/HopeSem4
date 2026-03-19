package Task2;
import java.util.Scanner;
public class SubwaySurf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch ='s';
        while (Character.toLowerCase(ch) != 'e') {
             ch = sc.next().charAt(0);
            switch (Character.toLowerCase(ch)) {
            case 'r':
                System.out.println("Move Right");
                break;
            case 'l':
                System.out.println("Move Left");
                break;
            case 'j':
                System.out.println("Move Jump");
                break;
            case 'd':
                System.out.println("Move Roll Down");
                break;
            case 'e':
                System.out.println("game exit");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
        sc.close();
    }
}