package Com.Review1st;

import java.util.Arrays;

public class RotatedArray {
    public static void main(String[] args) {
        int[] num = {2, 4, 6, 8, 1, 3, 5, 7, 9};
        int n = num.length;
        System.out.print("given array is: ");
        for (int x = 0; x<n; x++) {
            System.out.print(num[x] + " ");
        }
        System.out.println();
        int a = num[n-1], i;
        for (i = n-1; i > 0; i--) {
            num[i] = num[i - 1];

        }num[0] = a;
        System.out.println(Arrays.toString(num));


    }
}
