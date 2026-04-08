package Day15;
public class Leetcode169 {
   public static int majorityElement(int[] nums) {
        int ele=0;
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(c==0)
            {
                c=1;
                ele=nums[i];
            }
            else if(nums[i]==ele)
            {
                c++;
            }
            else
            {
                c--;
            }
        }
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==ele)
            {
                count++;
            }
        }
        if(count>nums.length/2)
        {
            return ele;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums={2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}