public class TestLinkedNode {
    public static void main(String[] arg) {
        LinkedNode p1 = new LinkedNode("A", null);
        LinkedNode p2 = new LinkedNode("AB", p1);
        LinkedNode p = new LinkedNode("ABC", p2);
        System.out.println(p.element);
        System.out.println(p.next.element);
        System.out.println(p.next.next.element);
        p = p.next;
        System.out.println("p:: " + p.element);
    }
}