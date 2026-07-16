import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.print("Enter the number of terms:");
      int n=s.nextInt();
      int duplicate_value;
      int a[]=new int[n];
      System.out.print("Enter the array value:");
      for(int i=0;i<a.length;i++){
        a[i]=s.nextInt();
      }
      System.out.println("Duplicates elements");
      for(int i=0;i<a.length;i++){
        for(int j=i+1;j<a.length;j++){
          if(a[i]==a[j]){
           
        System.out.println(a[i]);
          }
        
    }
    }
}
}
      


      
