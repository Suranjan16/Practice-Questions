
import java.util.Arrays;
import java.util.Scanner;

public class CheckIfTwoStringsAreAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toLowerCase().replaceAll("\\s", "");
        String b = sc.nextLine().toLowerCase().replaceAll("\\s","");

        if(a.length() != b.length()) {
            System.out.println(a + " and " + b + " are not anagram.");
        }

        char[]arr = a.toCharArray();
        char[]arr1 = b.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr1);

        if(Arrays.equals(arr, arr1)) {
            System.out.println(a + " and " + b + " are anagram.");
        } else {
            System.out.println(a + " and " + b + " are not anagram.");
        }
        sc.close();
    }
}
