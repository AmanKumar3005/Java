import java.util.*;
public class Special {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int pro = 1;
        int t = n;
        int temp = n;

        while(n>0){
            sum = sum + (n%10);
            pro = pro * (n%10);
            n = n/10;
        }
        if(temp==sum+pro)
        System.out.println("Special Number");
        else
        System.out.println("Not a Special Number");
    }
    
}
