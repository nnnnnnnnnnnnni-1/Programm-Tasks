import java.util.Scanner;
public class ClassTask15cos{
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter size of vectors: ");
        int n = Integer.parseInt(args[0]);
        //int n = scanner.nextInt();
        int[] vectA = new int[n];
        int[] vectB = new int[n];
        //System.out.println("Enter coordinates of vector A: ");
        int k = 1;
        while (k<=n){
            vectA[k-1] = Integer.parseInt(args[k]);
            k++;
        }
        //System.out.println("Enter coordinates of vector B: ");
        int i = 1;
        while (i<=n){
            vectB[i-1] = Integer.parseInt(args[k+i-1]);
            i++;
        }
        int proizv = 0;
        for (int j = 0; j < n; j++){
            proizv += vectA[j]*vectB[j];
        }
        double dlinavectA = 0;
        double dlinavectB = 0;
        for (int l = 0; l < n; l++){
            dlinavectA+=vectA[l];
            dlinavectB+=vectB[l];
        }
        double guessA = dlinavectA/2;
        double guessB = dlinavectB/2;
        double eps = 1e-10;
        while (Math.abs(guessA*guessA - dlinavectA) > eps){
            guessA = (double)(guessA + dlinavectA/guessA)/2;
        }
        while (Math.abs(guessB*guessB - dlinavectB) > eps){
            guessB = (double)(guessB + dlinavectB/guessB)/2;
        }
        double cosAB = 0;
        cosAB = cosAB + (double)(proizv / (guessA * guessB));
        System.out.println(proizv);
        System.out.println(guessA);
        System.out.println(guessB);
        System.out.println(cosAB);
    }
}
