public class TreeNode {
    int data;
    TreeNode childR, childL;

    public TreeNode(int data){
        this.data = data;
        this.childR = this.childL = null;
    }

    public String toString(){
        return "data: " + this.data;
    }
}
