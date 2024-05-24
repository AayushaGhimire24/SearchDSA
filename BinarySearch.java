
package Search;
import java.util.Scanner;
public class BinarySearch {
 static   int binarySearch(int array [],int key,int low ,int high){
        while(low<=high){
            int mid=low+(high-low)/2;
            if(array[mid]==key)
                return mid;
            if(array[mid]<key)
                low=mid+1;
            else
                high=mid-1;   
        }
        return-1;
    }
    public static void main(String[] args) {
        int A[]={1,2,3,4,5,6};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value to search:");
        int key=sc.nextInt();
        int result=binarySearch(A,key,0,A.length-1);
        if( result==-1)
            System.out.print("search unsuccessful");
        else
            System.out.print("Item found at index"+result);
    }
}
