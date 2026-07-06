import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        boolean ignore = false;
        for(int i = 0; i < n; i++) {
            if(arr[i] == 6)
                ignore = true;
            if(!ignore)
                sum += arr[i];
            if(ignore && arr[i] == 7)
                ignore = false;
        }
        System.out.println("Sum = " + sum);
        sc.close();
    }
}