public class CircularNode {
    int data;
    CircularNode forward, backward;

    public CircularNode() {
    }

    public CircularNode(int data) {
        this.data = data;
        forward = backward = null;

    }

    public int getData() {
        return this.data;
        
    }

}
