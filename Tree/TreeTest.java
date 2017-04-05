package Tree;

/**
 * Created by jgchoi.qa on 2017. 4. 4..
 */
public class TreeTest {
    public static void main(String[] args) {
        BinaryTree BT = new BinaryTree();

        BT.addRoot(50);
        BT.insert(25);
        BT.insert(15);
        BT.insert(30);
        BT.insert(75);
        BT.insert(85);
        BT.insert(80);

        System.out.println("inorder");
        BT.inorder(BT.getRoot());

        System.out.println("preorder");
        BT.preorder(BT.getRoot());

        System.out.println("postorder");
        BT.postorder(BT.getRoot());
    }
}
