import java.util.*;
public class Duplicates{
    public static void main(String[] args){
        int arr[] = {1,2,3,2,4,3,5};
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            if(set.contains(arr[i])){
                System.out.print(arr[i]+" ");
            }else{
                set.add(arr[i]);
            }
        }

    }
}