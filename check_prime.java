// import java.util.*;
// public class check_prime{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int count=0;
//         int N = sc.nextInt();
//         for(int i=1;i<=N;i++){
//         if(N%i==0)
//         {
//             count++;
//         }
//         }
//         if(count==2){
//             System.out.print("it is prime");
//         }
//         else
//         {
//             System.out.print("it is not prime");
//         }
//     }
// }



//optimized

import java.util.*;
public class check_prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        int N = sc.nextInt();
        for(int i=1;i*i<=N;i++){
        if(N%i==0)
        {
            count++;
        }
        if((N/i)!=i)
        {
            count++;
        }
    }
        if(count==2){
            System.out.print("it is prime");
        }
        else
        {
            System.out.print("it is not prime");
        }
    }
}