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
    }
}
