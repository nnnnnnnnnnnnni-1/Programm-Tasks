public class ClassTask16{
    public static void main (String args[]){
        int n = Integer.parseInt(args[0]);
        int[] masA = new int[n];
        int[] masB = {1,0,1};
        int a = 1;
        while (a <= n){
            masA[a-1] = Integer.parseInt(args[a]);
            a++;
        }
        for (int i = 0; i<n; i++){
            System.out.print(masA[i]);
        }
        System.out.println(" ");
        int[] masC = new int[n];
        int l = 1;
        while (l<=masB.length){
            masC[n-l] = masA[n-l] + masB[masB.length - l];
            l++;
        }
        while (l <= n){
            masC[n-l] = masA[n-l];
            l++;
        }
        for (int i = 0; i<n; i++){
            System.out.print(masC[i]);
        }
        System.out.println(" ");
        for (int k = 0; k > n; k++){
            if (masC[k]>9){
                masC[k] = masC[k]%10;
                masC[k-1] = masC[k-1]+1;
            }
        }
        double num = 0;
        for (int j = 0; j < n; j++){
            num = num + masC[n-j-1] * Math.pow(10, j);
        }
        System.out.println(num);
    }
}