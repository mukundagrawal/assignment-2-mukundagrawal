/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        MyBinarySearchTree bst = new MyBinarySearchTree();
        System.out.println( "Enter number of nodes" );/*-->*/
        int n = sc.nextInt();
        while(n-- > 0) {
            System.out.println( "Enter data" );/*-->*/
            int val = sc.nextInt();
            TreeNode node = new TreeNode();
            node.setData( val );
            bst.insert( node );
        }
        System.out.println( bst.showLeft( bst.getRoot(), false ) );

    }
}
