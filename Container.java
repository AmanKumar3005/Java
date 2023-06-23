import java.util.*;
public class Container {
    public static void main(String[] args){
        int arr[] = {3,5,6,2,1,4,9};
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length-1;
        if(arr[i]%2==0){
            while(i<j){
                System.out.println("("+arr[j]+","+arr[i]+")");
                i++;
                j--;
            }
        }
        else{
             while(i<j){
                System.out.println("("+arr[j]+","+arr[i]+")");
                i++;
                j--;
            }
            System.out.println("("+arr[arr.length/2]+",0)");
        }
     

    }
    
}
