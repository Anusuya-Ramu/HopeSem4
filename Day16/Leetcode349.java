package Day16;

import java.util.HashSet;
import java.util.Set;

public class Leetcode349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>s=new HashSet<>();
        Set<Integer>l=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            if(!s.contains(nums1[i]))
            {
                s.add(nums1[i]);
            }
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(s.contains(nums2[i]))
            {
                l.add(nums2[i]);
            }
        }
        int[] a=new int[l.size()];
        int i=0;
        for(int n:l)
        {
            a[i]=n;
            i++;
        }
        return a;
    }
    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        int[] a=intersection(nums1, nums2);
        for(int n:a)
        {
            System.out.print(n+" ");
        }
    }
}
