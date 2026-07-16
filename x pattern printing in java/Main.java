import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      String input=s.nextLine();
      char c[]=input.toCharArray();
      for(int i=0;i<=input.length()-1;i++){
        for(int j=0;j<=input.length()-1;j++){
          if(i==j || i+j==input.length()-1){
            System.out.print(input.charAt(j));
          }
          else{
            System.out.print(" ");
          }
        }
      
      System.out.print("\n");
      }
    }
}
