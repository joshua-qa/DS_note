package Tree;

/**
 * Created by jgchoi.qa on 2017. 4. 4..
 */
public class BinaryTree {
    public class Node {
        private int data;
        private Node parent;
        private Node leftChild;
        private Node rightChild;

        public Node(int data, Node parent, Node leftChild, Node rightChild) {
            this.data = data;
            this.parent = parent;
            this.leftChild = leftChild;
            this.rightChild = rightChild;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getParent() {
            return parent;
        }

        public void setParent(Node parent) {
            this.parent = parent;
        }

        public Node getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(Node leftChild) {
            this.leftChild = leftChild;
        }

        public Node getRightChild() {
            return rightChild;
        }

        public void setRightChild(Node rightChild) {
            this.rightChild = rightChild;
        }
    }

    private Node rootNode = null;

    public void addRoot(int data) {
        rootNode = new Node(data, null, null, null);
    }

    public Node getRoot() {
        return rootNode;
    }

    private Node addNode(int data, Node parent, Node left, Node right) {
        return new Node(data, parent, left, right);
    }

    public void insert(int data) {
        append(rootNode, data);
    }

    private boolean append(Node n, int data) {
        Node currentNode = n;

        if (currentNode.getData() > data) {
            if (currentNode.getLeftChild() == null) {
                Node newNode = addNode(data, currentNode, null, null);
                System.out.println(currentNode.getData() + "의 왼쪽에 " + newNode.getData() + " 삽입");
                currentNode.setLeftChild(newNode);
                return true;
            } else {
                return append(currentNode.getLeftChild(), data);
            }
        } else {
            if (currentNode.getRightChild() == null) {
                Node newNode = addNode(data, currentNode, null, null);
                System.out.println(currentNode.getData() + "의 오른쪽에 " + newNode.getData() + " 삽입");
                currentNode.setRightChild(newNode);
                return true;
            } else {
                return append(currentNode.getRightChild(), data);
            }
        }

    }

    public void preorder (Node n) {
        if (n == null) return;
        System.out.println(n.getData());
        preorder(n.getLeftChild());
        preorder(n.getRightChild());
    }

    public void inorder (Node n) {
        if (n == null) return;
        inorder(n.getLeftChild());
        System.out.println(n.getData());
        inorder(n.getRightChild());
    }

    public void postorder (Node n) {
        if (n == null) return;
        postorder(n.getLeftChild());
        postorder(n.getRightChild());
        System.out.println(n.getData());
    }
}