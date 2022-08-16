public class Stack {
    private StackNode last;
    int lenght;

    public Stack(){
        this.last = null;
        this.lenght = 0;
    }

    public boolean isEmpty(){
        return last == null;
    }

    public void push(int data){
        StackNode newNode = new StackNode(data);
        newNode.next = last;
        last = newNode;
        lenght++;
    }

    public int pop(){
        int temp = last.data;
        last = last.next;
        lenght--;
        return temp;
    }

    public int peek(){
        return last.data;
    }

    public int size(){
        return lenght;
    }

    public void clear(){
        while(!isEmpty()){
            pop();
        }
    }

    public void show(){
        while(!isEmpty()){
            System.out.println(last.data);
            last = last.next;
        }
    }
}
