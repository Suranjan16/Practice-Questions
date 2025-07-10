
import java.util.Scanner;


public class LinearSearchAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size = sc.nextInt();
        sc.nextLine();
        String[] a = new String[size];
        System.out.println("Enter names one by one: ");
        for(int i = 0; i < a.length; i++) {
            a[i] = sc.nextLine();
        }
        System.out.println("Enter the targetName which you want to search: ");
        String tName = sc.nextLine();

        boolean yes = isFound(a, tName);
        if(yes) {
            System.out.println("Target name found");
        } else {
            System.out.println("Target name not found");
        }

    }

    public static boolean isFound(String[]names, String targetName) {
        boolean found = false;
        for(String name: names) {
            if(name.equals(targetName)) {
                found = true;
            }
        }
        return found;
    }
}
