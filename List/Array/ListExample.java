package Joshua.DS.List;

/**
 * Created by Joshua on 2017-03-03.
 */
public class ListExample {
    public static void main(String[] args) {
        ArrayList AL = new ArrayList();

        System.out.println(AL.is_full());
        System.out.println(AL.is_empty());

        AL.add(0, 3);
        AL.add(0, 4);
        AL.add(0, 5);
        AL.delete(0);
        AL.display();

        LinkedList LL = new LinkedList();

        LL.add_first(20);
        LL.add_last(30);
        LL.add_first(10);
        LL.add_last(40);
        LL.add(25,2);

        LL.display();

        LL.delete(3);
        LL.display();

        System.out.println(LL.get_length());

        LL.delete(0);
        LL.display();

        System.out.println(LL.is_in_list(20) == 0 ? "true" : "false");
        System.out.println(LL.get_entry(0));
    }
}
