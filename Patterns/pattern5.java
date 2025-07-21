public class pattern5 {
    public static void main(String[] args) {
        int n=5;
        int temp=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=i){
                    System.out.print(temp);
                    temp++;
                }
            }
            System.out.println();
        }
        
    }
}
