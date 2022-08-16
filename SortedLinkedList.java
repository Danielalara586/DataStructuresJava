public class SortedLinkedList extends LinkedList{
    public SortedLinkedList(){
        super();
    }
    
    public SortedLinkedList insertSorted(int data){
        Node newNode = new Node(data);
        if(first == null){
            first = newNode;
        }
        else if(data < first.getData()){
            newNode.setRef(first);
            first = newNode;
        }
        else{
            Node prev, firstSorted;
            prev = firstSorted = first;
            while((firstSorted.getRef() != null) && data > firstSorted.getData()){
                prev = firstSorted;
                firstSorted = firstSorted.getRef();
            }
            if (data > firstSorted.getData()){
                prev = firstSorted;
            }
            newNode.setRef(prev.getRef());
            prev.setRef(newNode);
        }

        return this;
    }
}
