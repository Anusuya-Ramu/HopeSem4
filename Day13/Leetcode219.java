package Day13;
import java.util.HashSet;
public class Leetcode219 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                set.remove(nums[i - k - 1]);
            }
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,1,2,3};
        int k=2;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
}
