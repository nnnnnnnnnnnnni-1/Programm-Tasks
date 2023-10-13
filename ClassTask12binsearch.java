import java.util.Scanner;

public class ClassTask12binsearch{
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(args[0]);
        int[] mas = new int[n];
        int k = 1;
        while (k < n+1){
            mas[k-1] = Integer.parseInt(args[k]);
            k++;
        }
        for(int i = 0; i<n; i++){
            System.out.print(mas[i]);
            System.out.print(" ");
        }
        int mid = 0;
        int t = 0;
        if (n/2 != (int)(n/2)){
            mid = (int)(n/2);
        }else{
            mid = (int)(n/2) - 1;
        }
        System.out.println(mid);
        System.out.println("Search number: ");
        int target = scanner.nextInt();
        int i = 0;
        while (i<n){
            if (mas[mid]==target){
                System.out.println("True" + " " + mid);
                t++;
                break;
            }else{
                if (target > mas[mid]){
                    mid = mid + (int)(n/2);
                }else{
                    mid = (int)(n/2);
                }
                i++;
            }
        }
        if (t==0){
            System.out.println("False");
        }
    }

}