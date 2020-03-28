/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.node;

public class TreeNode {
    private int data;
    private TreeNode leftNode;
    private TreeNode rightNode;

    public int getData(){
        return data;
    }

    public void setData(int data){
        this.data = data;
    }

    public TreeNode getLeftNode(){
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode){
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode(){
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode){
        this.rightNode = rightNode;
    }

    @Override
    public String toString(){
        return "data ==>> " + getData();
    }
}



