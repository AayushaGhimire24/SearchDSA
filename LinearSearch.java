
package Search;
import java.util.*;
public class LinearSearch {
   static int linearSearch(int A[],int key){
        int i=0,j=A.length;
        while(i<j){
            if(key==A[i])
                    return i;
            else
                i++;                
    }
    
    return -1;//not found
}
    public static void main(String[] args) {
        int A[]={2,3,1,5,7,6,4};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value to search:");
        int key=sc.nextInt();
        int result=linearSearch(A,key);
        if( result==-1)
            System.out.print("search unsuccessful");
        else
            System.out.print("Item found at index"+result);
    }
}