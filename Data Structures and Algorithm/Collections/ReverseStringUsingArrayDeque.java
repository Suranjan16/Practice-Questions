import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseStringUsingArrayDeque {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        ArrayDeque<Character> deque = new ArrayDeque<>();

        for(char ch: a.toCharArray()) {
            deque.push(ch);
        }

        StringBuilder sb = new StringBuilder();
        while(!deque.isEmpty()) {
            sb.append(deque.pop());
        }

        System.out.println(sb.toString());
    }
}