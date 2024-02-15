import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Uyga vazifa!");
        int k = 3;
        int[] b = new int[k];
        int c = 0;
        int[] a = {1, -3,  2, 0, -1, -1, 2, 1, 0,0};
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0){
                b[c] = a[i];
                c++;
            }
           if (c == k){
               break;
           }
        }
        System.out.println(Arrays.toString(b));

    }
}