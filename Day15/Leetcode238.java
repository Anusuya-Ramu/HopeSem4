package Day15;
public class Leetcode238 {
    public static int[] productExceptSelf(int[] nums) {
        int pro=1;
        int c=0;
        for(int n : nums){
            if(n==0){
                c++;
            }else{
                pro*=n;
            }
            
        }
        for(int i=0;i<nums.length;i++){
        
            int t=0;
            if(c>1){
                nums[i]=0;
            }
            else if(c==1) {
                nums[i]= nums[i]==0?pro:0;
            }else{
                nums[i]= pro/nums[i];
            } 
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] res = productExceptSelf(nums);
        for(int n : res){
            System.out.print(n+" ");
        }
    }   
}