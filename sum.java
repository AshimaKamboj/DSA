import java.util.*;
public class sum {
    public static void sum(int i,int sum)
    {
        if(i<1){
            System.out.print(sum);
            return;
        }
        sum(i-1,sum+i);
    }
    public static void main(String[] args) {
        
    }
}
