public class Node {
    int data;
    Node reference;

    public Node(int number){
        this.data = number;
        this.reference = null;
    }

    public int getData(){
        return this.data;
    }

    public void setRef(Node ref){
        this.reference = ref;
    }

    public Node getRef(){
        return this.reference;
    }


}
