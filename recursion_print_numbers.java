// import java.util.*;
// public class recursion_print_numbers {
//     public static void print_num(int i,int n)
//     {
//         if(i>n) return;
//         System.out.print(i+" ");
//         print_num(i+1,n);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         print_num(1,n);
//     }
// }


import java.util.*;
public class recursion_print_numbers {
    public static void print_num(int i,int n)
    {
        if(i<1) return;
        System.out.print(i+" ");
        print_num(i-1,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print_num(n,n);
    }
}
