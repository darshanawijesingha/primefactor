
import java.util.Scanner;

public class primefactors{
    public static void main(String[] args) {
        Scanner ss =new Scanner(System.in);
        System.out.print("\t enter the number to find prime factors \n");
        int n=ss.nextInt();
        System.out.print("\t All the existing prime factors are :- \n");
        for(int i=2;i<=n;){
            if(n%i==0){   
                n=n/i;
                System.out.print(i );
                System.out.println();
               
            }  

            else{
       
                i++;
            }
            
        }
        
    }

    
}