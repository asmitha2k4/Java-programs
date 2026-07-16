import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the numbers of elements to insert");
      int n=s.nextInt();
      int a[]=new int[n];
      System.out.println("Enter the array");
      for(int i=0;i<n;i++){
        a[i]=s.nextInt();
      }
      int left=0;
      int right=a.length;
      
      while(left<=right){
        int mid=(left+right)/2;
        if(a[mid]>a[mid-1] && a[mid]>a[mid+1]){
          int value=a[mid];
        System.out.println("The bitonic point is "+value);
          break;
        }
        else if(a[mid]<a[mid-1]){
          right=mid-1;

        }
        else{
          left=mid+1;
        }
      }

    }
}
