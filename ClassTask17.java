public class ClassTask17{
    public static void main (String args[]){
        int n = Integer.parseInt(args[0]);
        int[] masA = new int[n];
        int a = 1;
        while (a<n+1){
            masA[a-1] = Integer.parseInt(args[a]);
            a++;
        }
        int mn = Integer.parseInt(args[n+1]);
        int l = 0;
        //if (masA[0] * mn <= 9){
            //l = n;
        //}else{
        //    l = n + 1;
        //}
        l = n;
        int [] masB = new int[l];
        for (int i = 0; i < n; i++){
            masB[i] = masA[i] * mn;
        }
        int k = 0;
        for (int i = masB.length-1; i >= 1; i=i-1){
            if (masB[i] > 9){
                masB[i-1] = masB[i-1] + (masB[i] - masB[i]%10)/10;
                masB[i] = masB[i]%10;
            }
        }
        double num = 0;
        for (int j = 0; j < masB.length; j++){
            num += masB[j] * Math.pow(10, masB.length-j-1);
        }
        System.out.println(num);
    }
}