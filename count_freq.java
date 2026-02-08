import java.util.*;
public class count_freq{
    public static int countfreq(int[] arr,int target){
    int count=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
            count++;
        }
    }
    return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("enter target: ");
        int target = sc.nextInt();
        System.out.print("freq is : "+countfreq(arr,target));
    }
}