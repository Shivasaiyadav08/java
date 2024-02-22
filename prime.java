import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter");
        int n=in.nextInt();
        for(int i=2;i<=n;i++){
            int fa=0;
            for(int j=1;j<=i;j++){
                
                if(i%j==0)
                {
                    
                    fa=fa+1;
                    
                }
            }
            if(fa==2){
                System.out.println(i);
            }
                
            
         } 
    }     
      
    
}
