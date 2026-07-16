import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.print("Enter the row: ");
      int row=s.nextInt();
      System.out.print("Enter the column:");
      int col=s.nextInt();
      for(int i=1;i<=row;i++){
        int val=i%2==0 ?0:1;
       

        for(int j=1;j<=i;j++){
          System.out.print(val+" ");
          if(val==0){
            val=1;
          }
          else{
            val=0;
          }

          }
          System.out.println(" ");
        }
        
      }
    }



      
