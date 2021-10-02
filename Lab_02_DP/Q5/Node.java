package Q5;

public class Node {
    Integer key;
    Character value;
    Node parent;
    Node left;
    Node right;

    public Node(Integer key, Character value) {
        this.key = key;
        this.value = value;
        this.parent = null;
        this.left = null;
        this.right = null;
    }

    public String find(){
        if (this.left == null && this.right ==null){
            return "";
        }
        if (this.left != null && this.right ==null){
            return this.value+this.left.find();
        }
        if (this.left == null && this.right !=null){
            return this.value+this.right.find();
        }
        return this.left.find()+this.right.find();
    }
}