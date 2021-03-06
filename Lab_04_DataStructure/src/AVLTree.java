/**
 * Welcome! Make sure to check out 'readme.md' for a rundown of requirements/description of this implementation
 * that may differ from normal implementations. Before starting, it may also be worth checking out Tree.java
 * and BinarySearchTree.java as all method description is contained in the superclass unless edited. For
 * example: the description for 'insert' cannot be found here. It is in the superclass!
 * <p>
 * Please note that you may edit this class as much as you like (i.e.,create helper methods if you want!).
 * So long as you genuinely pass the tests (i.e., do not change existing methods signatures). Ask questions if you are
 * lost or unsure.
 * You SHALL NOT edit any other classes.
 * <p>
 * Lastly, if you are looking to better visualise the results of your insertion, you are free print the contents
 * of the method '.display()' (found in Tree.java which class, AVLTree, extends through BinarySearchTree). This
 * method will provide you with a graphical representation of the tree.
 */
public class AVLTree<T extends Comparable<T>> extends BinarySearchTree<T> {
    /*
        As a result of inheritance by using 'extends BinarySearchTree<T>,
        all class fields within BinarySearchTree are also present here.
        So while not explicitly written here, this class has:
            - value
            - leftNode
            - rightNode
     */

    public AVLTree(T value) {
        super(value);
        // Set left and right children to be of EmptyAVL as opposed to EmptyBST.
        this.leftNode = new EmptyAVL<>();
        this.rightNode = new EmptyAVL<>();
    }

    public AVLTree(T value, Tree<T> leftNode, Tree<T> rightNode) {
        super(value, leftNode, rightNode);
    }

    /**
     * @return balance factor of the current node.
     */
    public int getBalanceFactor() {
        /*
             Note:
             Calculating the balance factor and height each time they are needed is less efficient than
             simply storing the height and balance factor as fields within each tree node (as some
             implementations of the AVLTree do). However, although it is inefficient, it is easier to implement.
         */
        return leftNode.getHeight() - rightNode.getHeight();
    }

    @Override
    public AVLTree<T> insert(T element) {
        AVLTree<T> newTree;

        if (element == null)
            throw new IllegalArgumentException("Input cannot be null");

        if (element.compareTo(value) > 0) {
            newTree  = new AVLTree<>(value,leftNode,rightNode.insert(element));
        } else if (element.compareTo(value) < 0) {
            newTree  = new AVLTree<>(value,leftNode.insert(element),rightNode);
        } else {
            return this;
        }

        if (newTree.getBalanceFactor() == 1 || newTree.getBalanceFactor() == 0 || newTree.getBalanceFactor() == -1){
            return newTree;
        } else {
            if (newTree.getBalanceFactor()>0){
                // left problem case 1 or 3
                AVLTree<T> curLeftNode = (AVLTree<T>) newTree.leftNode;
                //left violate case 1
                if (curLeftNode.getBalanceFactor()>=0){
                    newTree = newTree.rightRotate();
                    return newTree;
                } else {
                    //else case 3
                    curLeftNode = curLeftNode.leftRotate();
                    newTree = new AVLTree<>(value,curLeftNode,rightNode);
                    newTree = newTree.rightRotate();
                    return newTree;
                }
            } else if (newTree.getBalanceFactor()<0){
                // right problem case 2 or 4
                AVLTree<T> curRightNode = (AVLTree<T>) newTree.rightNode;
                //right violate case2
                if (curRightNode.getBalanceFactor()<=0){
                    newTree = newTree.leftRotate();
                    return newTree;
                } else {
                    //else case 4
                    curRightNode = curRightNode.rightRotate();
                    newTree = new AVLTree<>(value, leftNode, curRightNode);
                    newTree = newTree.leftRotate();
                    return newTree;
                }
            } else {
                return newTree;
            }
        }
    }

    /**
     * Conducts a left rotation on the current node.
     *
     * @return the new 'current' or 'top' node after rotation.
     */
    public AVLTree<T> leftRotate() {

        Tree<T> newParent = this.rightNode;
        Tree<T> newRightOfCurrent = newParent.leftNode;

        Tree<T> newLeftOfCurrent = this.leftNode;
        Tree<T> newRight = newParent.rightNode;

        newParent.leftNode =  new AVLTree<>(value,newLeftOfCurrent,newRightOfCurrent);
        newParent.rightNode = newRight;

        return (AVLTree<T>)newParent;
    }

    /**
     * Conducts a right rotation on the current node.
     *
     * @return the new 'current' or 'top' node after rotation.
     */
    public AVLTree<T> rightRotate() {
        Tree<T> newParent = this.leftNode;
        Tree<T> newRightOfCurrent = this.rightNode;

        Tree<T> newLeftOfCurrent = newParent.rightNode;

        newParent.rightNode =  new AVLTree<>(value,newLeftOfCurrent,newRightOfCurrent);

        return (AVLTree<T>)newParent;
    }

    /**
     * Note that this is not within a file of its own... WHY?
     * The answer is: this is just a design decision. 'insert' here will return something specific
     * to the parent class inheriting Tree from BinarySearchTree. In this case an AVL tree.
     */
    public static class EmptyAVL<T extends Comparable<T>> extends EmptyTree<T> {
        @Override
        public Tree<T> insert(T element) {
            // The creation of a new Tree, hence, return tree.
            return new AVLTree<T>(element);
        }
    }
}
