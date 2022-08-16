public class CircularLinkedList {
    CircularNode first, last;

    public CircularLinkedList() {
        first = last = null;
    }

    public void add(int data) {
        CircularNode newNode = new CircularNode(data);
        if (first == null) {
            first = newNode;
            first.forward = first;
            newNode.backward = last;
            last = newNode;
        } else {
            last.forward = newNode;
            newNode.forward = first;
            newNode.backward = last;
            last = newNode;
            first.backward = last;
        }
    }

    public void delete(int data) {
        CircularNode current = new CircularNode();
        CircularNode prev = new CircularNode();
        current = first;
        prev = last;

        do {
            if (current.data == data) {
                if (current == first) {
                    first = first.forward;
                    last.forward = last;
                    first.backward = last;
                } else if (current == last) {
                    last = prev;
                    first.backward = last;
                    last.forward = first;
                } else {
                    prev.forward = current.forward;
                    current.forward.backward = prev;
                }
                prev = current;
                current = current.forward;
            }
        } while (current != first);
    }

    public void show() {
        CircularNode current = new CircularNode();
        current = first;
        do {
            System.out.println(current.data);
            current = current.forward;
        } while (current != first);
    }

}
