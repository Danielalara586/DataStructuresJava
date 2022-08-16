import javax.swing.border.EmptyBorder;

public class Queue {
    QueueNode first, last;
    int length;

    public Queue() {
        this.first = this.last = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return this.first == null;
    }

    public void enqueue(int data) {
        QueueNode newNode = new QueueNode(data);
        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
        }
        last = newNode;
        length++;
    }

    public int dequeue() {
        int temp = first.data;
        first = first.next;
        length--;
        return temp;
    }

    public int firstIn(){
        return first.data;
    }

    public int size() {
        return this.length;
    }

    public void show() {
        while(!isEmpty()){
            System.out.println(first.data);
            first = first.next;
        }
    }
}
