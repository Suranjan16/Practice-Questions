// package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().trim().split("\\s+");
        int[]arr = new int[str.length];
        for(int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        int target = sc.nextInt();
        int[]b = twoSum(arr, target);
        System.out.println(Arrays.toString(b));
    }

    public static int[] twoSum(int[]a, int target) {
        for(int i = 0; i < a.length; i++) {
            for(int j = i+1; j < a.length; j++) {
                if(a[i] + a[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
}
