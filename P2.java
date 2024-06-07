
import java.util.Scanner;

public class P2{    
 public static void main(String args[]){    
  int i,flag=0; 
  Scanner sc = new Scanner(System.in);
  System.out.println("enter number:");    
  int n = sc.nextInt();        
   for(i=2;i<=n/2;i++){      
    if(n%i==0){      
     System.out.println(n+" is not prime number");      
     flag=1;      
     break;      
    }      
   }      
   if(flag==0)  {
     System.out.println(n+" is prime number"); 
     }  
  } 
}    
