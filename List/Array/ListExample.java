package Joshua.DS.List;

/**
 * Created by Joshua on 2017-03-03.
 */
public class ListExample {
    public static void main(String[] args) {
        ArrayList AL = new ArrayList(20);

        System.out.println(AL.is_full());
        System.out.println(AL.is_empty());
        AL.display();

        ArrayList AL2 = new ArrayList();
        System.out.println(AL2.is_full());
        System.out.println(AL2.is_empty());
        AL2.display();
    }
}
