public class pattern12 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            int num1=i;
            for(int j=1;j<=i;j++){
                System.out.print(num1);
                num1--;
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
