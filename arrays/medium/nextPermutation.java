
import java.util.*;



public class nextPermutation {
    public static void func(int[] nums){
        int n=nums.length;
        int idx=-1;
        int valid=0;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx=i;
                valid=1;
                break;
            }
        }
         if(idx==-1 && valid==0){
            Arrays.sort(nums);
        }
        else{
            for(int i=n-1;i>=0;i--){
                if(nums[i]>nums[idx]){
                    int temp=nums[i];
                    nums[i]=nums[idx];
                    nums[idx]=temp;
                    break;
                }
            }
            int start=idx+1;
            int end=n;
       
             Arrays.sort(nums,start,end);
        }
        
        
        for(int i=0;i<=n-1;i++){
            System.out.print(nums[i]+" ");
        }

    }

    public static void main(String[] args){
        
        int nums[]={5,4,3,2,1};
        
        func(nums);
        
    }
    
}
