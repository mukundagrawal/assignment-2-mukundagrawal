/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

import problem4.node.Node;
public class MyQueue {
    private Node front;
    private Node rear;

    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public Node getRear() {
        return rear;
    }

    public void setRear(Node rear) {
        this.rear = rear;
    }

    public void enQueue(Node newNode){
        if(front == null && rear == null) {
            setFront( newNode );
            setRear( newNode );
        }
        else{
            getRear().setNext( newNode );
            setRear( getRear().getNext() );
        }
    }

    public Node deQueue(){
        Node temp;
        if(getFront() == null) {
            return null;
        }
        else if(getFront().getNext() == null) {
            temp = getFront();
            setFront( null );
            setRear( null );
        }
        else{
            temp = getFront();
            setFront( getFront().getNext() );
        }
        return temp;
    }
}