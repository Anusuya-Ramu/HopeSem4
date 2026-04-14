package Day17;
import java.util.*;
public class IteratorImplementation {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(15);
        l.add(20);
        l.add(26);
        l.add(30);
        Iterator<Integer> it = l.iterator();
        while(it.hasNext()){
            if(it.next()%2==0){
                it.remove();
            }else{
            System.out.println(it.next());
            }
        }
        List<Integer> l1 = new ArrayList<>();
        l1.add(15);
        l1.add(20);
        l1.add(26);
        l1.add(30);
        for(int i=0;i<l1.size();i++){
            if(l1.get(i)%2==0){
                l1.remove(i);
            }else{
                System.out.println(l1.get(i));
            }
        }
    }
}
