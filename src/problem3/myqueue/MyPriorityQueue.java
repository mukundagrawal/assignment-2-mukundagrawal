/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.node.Node;

public class MyPriorityQueue {
    private Node front;

    public Node getFront(){
        return front;
    }

    public void setFront(Node front){
        this.front = front;
    }

    public void enQueue(Node newNode){
        Node temp = getFront();
        if(getFront() == null || getFront().getStudent().getRollNumber() > newNode.getStudent().getRollNumber()) {
            setFront( newNode );
            getFront().setNextNode( temp );
        }
        else{
            while(temp.getNextNode() != null && temp.getNextNode().getStudent().getRollNumber() <= newNode.getStudent().getRollNumber()) {
                temp = temp.getNextNode();
            }
            newNode.setNextNode( temp.getNextNode() );
            temp.setNextNode( newNode );
        }
    }

    public Node deQueue(){
        if(getFront() == null) {
            System.out.println( "Empty queue" );
            return null;
        }
        Node temp = getFront();
        setFront( getFront().getNextNode() );
        return temp;
    }
}
