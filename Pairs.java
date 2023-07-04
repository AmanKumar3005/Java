import java.util.*;

public class Pairs {
    public static void main(String[] args){
        int num[] = {2,4,5,3};
        int target = 12;
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
               if(num[i]*num[j]<=target){
                  System.out.println("("+num[i]+" "+num[j]+")");
               }
            }
        }
    }
    
}
