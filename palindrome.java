import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rev=0;
        int n = sc.nextInt();
        int original = n;
        while(n>0){
            int lastdigit=n%10;
            n=n/10;
            rev=(rev*10)+lastdigit;
        }
        if(rev==original){
            System.out.println("Yes it is a palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
        }
    }
}
