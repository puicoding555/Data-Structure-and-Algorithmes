public class LinkedNode {
    public Object element;
    public LinkedNode next;

    public LinkedNode(Object obj, LinkedNode node) {
        element = obj;
        next = node;
    }
}