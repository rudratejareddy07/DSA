



public class  trappedRainwater {
    public static void trappedWater(int arr[]){
        //creating auxiliary arrays
        int n=arr.length;
        int[] leftArr=new int[n];
        leftArr[0]=arr[0];
        for(int i=1;i<n;i++){
            leftArr[i]=Math.max(arr[i],leftArr[i-1]); //max height from left        }
        }
        int[] rightArr=new int[n];
        rightArr[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightArr[i]=Math.max(arr[i],rightArr[i+1]); //max height from left        }
        }
        int vol=0;
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(leftArr[i],rightArr[i])-arr[i];
            vol+=waterlevel;
        }
        System.out.println(vol);

    } 
    public static void main(String args[]){
        int arr[]={4,2,0,6,3,2,5};
        trappedWater(arr);
        // Console.log(;

    }
}
