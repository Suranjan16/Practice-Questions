import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModificationException {
    public static void main(String[] args) {
        CopyOnWriteArrayList list = new CopyOnWriteArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        for(Object a: list) {
            System.out.println(a);

            list.add(50);
        }

        System.out.println(list);
    }
}
