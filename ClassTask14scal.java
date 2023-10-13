public class ClassTask14scal{
    public static void main (String []args){

        int n = Integer.parseInt(args[0]);
        int k = 1;
        int i = 1;
        int[] vectA = new int[n];
        int[] vectB = new int[n];
        while (k<=n){
            vectA[k-1] = Integer.parseInt(args[k]);
            k++;
        }
        while (i<=n){
            vectB[i-1] = Integer.parseInt(args[k+i-1]);
            i++;
        }
        int proizv = 0;
        for (int j = 0; j < n; j++){
            proizv += vectA[j]*vectB[j];
        }
        System.out.println(proizv);
    }

}