package Day13;

import java.util.HashSet;
import java.util.Set;

public class Leetcode217 {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer>s=new HashSet<>();
        boolean res=false;
        for(int i=0;i<nums.length;i++)
        {
            if(!s.contains(nums[i]))
            {
                s.add(nums[i]);
            }
            else
            {
                res=true;
                break;
            }
        }
        return res;

        //for(int i:nums) s.add(i);
        //return !(s.size()==nums.length);
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
}

