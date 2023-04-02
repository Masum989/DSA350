package ArrayEasy;
import java.util.*;
import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean ContainsDupl(int arr[], int n){
       Set<Integer> s = new HashSet<Integer>();
        for (int i=0;i<n;i++) {
            if(s.contains(arr[i])){
                return true;
            }
            s.add(arr[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
       if( ContainsDupl(arr,n)){
           System.out.println("TRUE");
       }else{
           System.out.println("FALSE");
       }

    }
}
