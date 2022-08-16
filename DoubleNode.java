public class DoubleNode {

    int data;
    DoubleNode forward, backward;
    
    public DoubleNode(int data){
        this.data = data;
        forward = backward = null;
    }

    public int getData(){
        return this.data;
    }

}
