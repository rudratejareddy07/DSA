import java.util.*;
class maxSubArray{
    public static int prefixArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int[] prefix=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int sum=0;
                if(i==0){sum=prefix[j];}
                else{
                    sum=prefix[j]-prefix[i-1];
                }
                
                    if(sum>maxSum){
                        maxSum=sum;
                    }
                
            }
        }
        return maxSum;       
    }



    public static int kadanes(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int min=-(10*10*10*10);
        int curr=min;
        
        for(int i=0;i<nums.length;i++){
            curr=curr+nums[i];
            if(curr<min){
                curr=min;
            }
            maxSum=Math.max(curr,maxSum);
        }
        return maxSum;       
    }
    public static void main(String[] args){
        
        int nums[]={-2,-3,4,-1,-2,1,5,-3};
        System.out.println(kadanes(nums));
        
    }
}