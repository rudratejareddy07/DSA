

public class basics{
    public static void printSubarray(int arr[]){
        int maxSum=0;
        int minSum=arr[0];
        for(int i=0;i<arr.length;i++){
            int curr=i;
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]);
                    sum= sum +arr[k];
                    if(sum>maxSum){
                        maxSum=sum;
                    }
                    if(sum<minSum){
                        minSum=sum;
                    }
                }
                System.out.println();

            }
            System.out.println();
        }
        System.out.println(maxSum);
        System.out.println(minSum);
    }
    public static void main(String[] args){
        int arr[]={11,2,3,4,5};
        printSubarray(arr);

    }
}