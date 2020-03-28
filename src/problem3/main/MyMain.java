/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem3.node.Node;
import problem5.student.Student;

import java.util.Scanner;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args){
        Scanner sc = new Scanner( System.in );
        MyPriorityQueue priorityQueue = new MyPriorityQueue();
        System.out.println( "Enter number of nodes " );/*--->*/
        int nodes = sc.nextInt();
        while(nodes-- > 0) {
            Student student = new Student();
            System.out.println( "Enter name " );/*--->*/
            String name = sc.next().trim();
            System.out.println( "Enter roll number" );/*--->*/
            int roll = sc.nextInt();
            student.setName( name );
            student.setRollNumber( roll );

            Node node = new Node();
            node.setStudent( student );

            priorityQueue.enQueue( node );
        }
        System.out.println( "Displaying Queue" );

        Node node = priorityQueue.deQueue();
        while(node != null) {
            System.out.println( node );
            node = priorityQueue.deQueue();
        }
    }
}
