public class LinkedList {
    protected Node first = null;

    public LinkedList addFirst(int data) {
        Node newNode = new Node(data);
        newNode.reference = first;
        first = newNode;
        return this;

    }

    public void addLast(int data) {
        Node newNodeF = new Node(data);
        Node temp;
        newNodeF.reference = null;

        if (first == null) {
            first = newNodeF;
            return;
        }

        for (temp = first; temp.getRef() != null; temp = temp.getRef());
        temp.setRef(newNodeF);

    }

    public Node search(int data) {
        Node search, nullNode;
        nullNode = new Node(0);
        for(search = first; search != null; search = search.getRef()){
            if (data == search.data){
                return search;
            }
            else {
                return nullNode;
            }
        }
        return nullNode;

    }

    public void delete(int data) {
        boolean found = false;
        Node thisValue = first, prev = null;

        while(thisValue != null && !found){
            found = (thisValue.data == data);
            if(!found){
                prev = thisValue;
                thisValue = thisValue.getRef();
            }
        }

        if(thisValue != null){
            if(thisValue == first){
                first = thisValue.reference;
            }
            else{
                prev.setRef(thisValue.reference);
            }
        }

    }

    public void show() {
        Node nodeView = first;

        while (nodeView != null) {
            System.out.println(nodeView.data);
            nodeView = nodeView.reference;
        }
    }

}
