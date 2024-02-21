import org.w3c.dom.Node;

public class CircularlyLinkedList<E> {
    private Node<E>tail=null;
    private int size=0;
    public CircularlyLinkedList(){}
    public boolean isEmpty(){
        return size==0;}
    public int size(){
        return size;}

    public E first(){
        if (isEmpty())
            return null;
        return tail.next.element;

    }
    public E last(){
        if (isEmpty())
            return null;
        return tail.element;

    }
    public void rotate(){
        if (tail!=null)
        tail=tail.next;
    }
    public void addFirst(E elem){
        if (size==0)
        {tail=new Node<>(elem,null);
            tail.next=tail;
        }
        else {
            Node <E>newest=new Node<>(elem,tail.next);
            tail.next=newest;
        }
        size++;
    }
public void addLast(E ppp){
        addFirst(ppp);
        tail=tail.next;
}
public E removeFirst(){
        if (isEmpty())return null;
        Node<E> n=tail.next;
        if (n==tail)tail=null;
        else tail.next=n.next;
        size--;
        return n.element;

}









    private static class Node<E>
    {
        E element;
        Node<E>next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

    }

}
