import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the no.of elements to insert:");
      int n=sc.nextInt();
      System.out.println("Enter the array elements");
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      Arrays.sort(arr);
      System.out.println("Enter the element to search:");
      int k=sc.nextInt();
      int left=0;
      int right=n-1;
      boolean found=false;
      while(left<=right){
        int mid=(left+right)/2;
        if(arr[mid]==k){
          System.out.println("search element is "+(mid+1));
          found=true;
          break;
        }
        else if(arr[mid]<k){
          left=mid+1;
        }
        else{
          right=mid-1;
        }
      }
      
      if(!found){
        System.out.println("Element is not found");
    }
    }
}
