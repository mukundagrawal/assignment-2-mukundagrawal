/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;
import problem1.node.TreeNode;

import java.util.ArrayList;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    private TreeNode root;
    private ArrayList<Integer> arrayList;

    public MyBinarySearchTree(){
        arrayList = new ArrayList<>();
    }

    public TreeNode getRoot(){
        return root;
    }

    public void setRoot(TreeNode root){
        this.root = root;
    }

    public void insert(TreeNode newNode){
        if(getRoot() == null) {
            setRoot( newNode );
            return;
        }
        TreeNode parent = null;
        TreeNode current = getRoot();
        boolean isLeft = true;

        while(current != null) {
            parent = current;
            if(newNode.getData() > current.getData()) {
                current = current.getRightNode();
                isLeft = false;
            }
            else{
                current = current.getLeftNode();
                isLeft = true;
            }
        }
        if(isLeft)
            parent.setLeftNode( newNode );
        else
            parent.setRightNode( newNode );
    }

    public int showLeft(TreeNode node, boolean isLeft){
        int c = 0;

        if(node == null)
            return c;

        if(isLeft)
            System.out.println( node );
        if(node.getLeftNode() == null)
            c++;
        c += showLeft( node.getLeftNode(), true );
        c += showLeft( node.getRightNode(), false );
        return c;
    }

    public void showTreeData(TreeNode node){
        if(node == null)
            return;
        System.out.println( node );
        showTreeData( node.getLeftNode() );
        showTreeData( node.getRightNode() );
    }

    private void addElementToList(TreeNode node){
        if(node == null)
            return;
        arrayList.add( node.getData() );
        addElementToList( node.getLeftNode() );
        addElementToList( node.getRightNode() );
    }

    public ArrayList<Integer> getPreOrderList(){
        addElementToList( getRoot() );
        return arrayList;
    }

    public void postOrderTraversal(TreeNode node){
        if(node == null)
            return;
        postOrderTraversal( node.getLeftNode() );
        postOrderTraversal( node.getRightNode() );
        System.out.println( node );
    }
}

