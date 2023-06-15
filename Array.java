import java.util.*;
import java.util.Scanner;
class Array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[5];
        int i = arr.length-1;
        while(n>0){
            arr[i] = n%10;
            n = n/10;
            i--;
        }  
        System.out.println(Arrays.toString(arr));
    }
}