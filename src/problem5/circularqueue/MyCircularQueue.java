/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;
import problem5.node.Node;
//to implement circular queue
public class MyCircularQueue {
    private Node front;
    private Node rear;

    public Node getFront(){
        return front;
    }

    public void setFront(Node front){
        this.front = front;
    }

    public Node getRear(){
        return rear;
    }

    public void setRear(Node rear){
        this.rear = rear;
    }

    public void enQueue(Node newNode){
        if(getFront() == null && getRear() == null) {
            setFront( newNode );
            setRear( newNode );
            getRear().setNext( getFront() );
        }
        else{
            newNode.setNext( getFront() );
            getRear().setNext( newNode );
            setRear( getRear().getNext() );
        }

    }

    public void traverseQueue(){
        Node temp = getFront();
        while(true) {
            System.out.println( temp.getStudent() );
            temp = temp.getNext();
            if(temp == getFront())
                break;
        }

    }

    public Node deQueue(){
        Node temp;
        if(getFront() == null)
            return null;
        else if(getFront() == getRear()) {
            temp = getFront();
            setRear( null );
            setFront( null );
        }
        else{
            temp = getFront();
            setFront( getFront().getNext() );
            getRear().setNext( getFront() );
        }
        return temp;
    }

    public void removeZeroBacklogRecords(){
        Node before = getRear();
        Node ahead = getFront();
        while(true) {
            if(ahead.getStudent().getBackLogCounter() == 0) {
                System.out.println( "Removed data --> " );
                System.out.println( ahead.getStudent() );
                if(ahead == getFront()) {
                    before.setNext( ahead.getNext() );
                    setFront( getFront().getNext() );
                    ahead = ahead.getNext();
                    continue;
                }
                else if(ahead == getRear()) {
                    before.setNext( ahead.getNext() );
                    setRear( before );
                    break;
                }
                else{
                    before.setNext( ahead.getNext() );
                    ahead = ahead.getNext();
                }
            }
            else{
                ahead = ahead.getNext();
                before = before.getNext();
            }
            if(ahead == getFront())
                break;
        }
    }

}
