import java.util.Scanner;

public class Problem_1265 {
    private static boolean flag = false;

    public static class Node<E> {
        public Node left;
        public Node right;
        public E e;

        public Node(E e) {
            this.e = e;
        }
    }

    public static Node<Integer> reBuild_BinaryTree(char[] preOrder, int preStart, int preEnd, char[] midOrder, int midStart, int midEnd) {
        if (preOrder.length != midOrder.length || preOrder.length == 0 || midOrder.length == 0)
            throw new RuntimeException("date not correct");
        if (preOrder == null || midOrder == null)
            throw new RuntimeException("Null point Exception");
        if (midStart > midEnd && preStart > preEnd) return null;
        if (midStart == midEnd && preStart == preEnd) {
            if (preOrder[preStart] != midOrder[midStart]) {
                flag = true;
                return null;
            }
            return new Node(midOrder[midEnd]);
        }
        int mid;
        int pre;
        for (mid = midStart; mid < midEnd; mid++) {
            if (midOrder[mid] == preOrder[preStart]) break;
        }
        if (mid == midOrder.length) {
            flag = true;
            return null;
        }
        Node node = new Node(preOrder[preStart]);
        pre = preStart + (mid - midStart);
        node.left = reBuild_BinaryTree(preOrder, preStart + 1, pre, midOrder, midStart, mid - 1);
        node.right = reBuild_BinaryTree(preOrder, pre + 1, preEnd, midOrder, mid + 1, midEnd);
        return node;
    }

    public static void postOrder_print(Node head) {
        if (flag) return;
        if (head == null) return;
        postOrder_print(head.left);
        postOrder_print(head.right);
        System.out.print(head.e);
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            String str1 = cin.next();
            char[] preOrder = str1.toCharArray();
            String str2 = cin.next();
            char[] midOrder = str2.toCharArray();
            Node<Integer> head = reBuild_BinaryTree(preOrder, 0, preOrder.length - 1, midOrder, 0, midOrder.length - 1);
            postOrder_print(head);
        }
    }
}