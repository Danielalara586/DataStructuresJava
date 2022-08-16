public class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    public void add(int data) {
        TreeNode newNode = new TreeNode(data);
        if (root == null) {
            root = newNode;
        } else {
            TreeNode temp = root, parent;
            while (true) {
                parent = temp;
                if (data < temp.data) { // left
                    temp = temp.childL;
                    if(temp == null){
                        parent.childL = newNode;
                        return;
                    }
                } else { // right
                    temp = temp.childR;
                    if(temp == null){
                        parent.childR = newNode;
                        return;
                    }
                }
            }
        }

    }

    public boolean isEmpty() {
        return root == null;
    }

    public void show(TreeNode node) {
        if(node != null){
            show(node.childL);
            System.out.println(node.data);
            show(node.childR);
        }
    }

}
