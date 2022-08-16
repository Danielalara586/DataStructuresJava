public class DoubleLinkedList {
    DoubleNode first, last;
    int lenght = 0;

    public DoubleLinkedList() {

    }

    public void add(int data) {
        DoubleNode newNode = new DoubleNode(data);
        if (lenght == 0) {
            first = last = newNode;
        } else {
            newNode.backward = last;
            last.forward = newNode;
            last = newNode;
        }
        lenght++;
    }

    public void addFirst(int data) {
        DoubleNode newNode = new DoubleNode(data);
        if (lenght == 0) {
            first = newNode;
            last = newNode;
        } else {
            newNode.forward = first;
            first.backward = newNode;
            first = newNode;
        }

    }

    public boolean delete() {
        if (lenght > 0) {
            if (lenght() == 1) {
                first = null;
                last = null;
            } else {
                last.backward.forward = null;
                last = last.forward = null;
            }
            lenght--;
        }
        return false;

    }

    public boolean deleteFirst() {
        if (lenght > 0) {
            if (lenght() == 1) {
                first = null;
                last = null;
            } else {
                first.forward.backward = null;
                first = first.forward;
            }
            lenght--;
        }
        return false;
    }

    public void show() {
        DoubleNode showNode;
        showNode = first;
        while (showNode != null) {
            System.out.println(showNode.data);
            showNode = showNode.forward;
        }

    }

    public boolean isEmpty(){
       return lenght() == 0;
    }

    public int lenght(){
        return this.lenght;
    }

}
