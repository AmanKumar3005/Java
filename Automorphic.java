import java.util.*;
public class Automorphic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        if(n%10 == (n*n)%10 ){
            System.out.println("AUTOMORPHIC NUMBER");
        }
        else{
            System.out.println("NOT A AUTOMORPHIC NUMBER");
        }
    }
    
}
