import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original=n;
        int sum=0;
        while(n>0){
            int lastdigit=n%10;
            sum=sum+(lastdigit*lastdigit*lastdigit);
            n=n/10;
        }
        if(sum==original)
        {
            System.out.println("it is armstrong");
        }
        else
        {
            System.out.println("it is not armstrong");
        }
    }
}
