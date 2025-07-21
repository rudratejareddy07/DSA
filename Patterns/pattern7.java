public class pattern7 {
    public static void main(String[] args) {
        int n=4;
        int num=1;
        for(int i=1;i<=n;i++){
            
                if(i%2==0){
                    num=0;
                    for(int j=1;j<=n;j++){
                    
                    if(j<=i){
                        System.out.print(num);
                        if(num==0){
                            num=1;
                        }
                        else{
                            num=0;
                        }
                    }
                }
                }
                else{
                    num=1;
                    for(int j=1;j<=n;j++){
                    if(j<=i){
                        System.out.print(num);
                        if(num==0){
                            num=1;
                        }
                        else{
                            num=0;
                        }
                    }
                }
                }
                
                
            
            System.out.println();
        }
    }
}
