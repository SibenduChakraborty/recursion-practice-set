package com.recursion;

import java.util.Scanner;

class Node{
    Node right;
    Node left;
    int data;
    public Node(int data){
        this.data=data;
    }
}
public class binarytree {
    static void printtree(Node n){
        if(n==null){
            return;
        }
        printtree(n.left);
        System.out.print(n.data+" ");
        printtree(n.right);
    }
    static Node createtree(){
        Node root= null;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter data: ");
        int data=sc.nextInt();
        if(data==-1){
            return null;
        }
        root= new Node(data);

        System.out.println("enter data for left of: "+data);
        root.left=createtree();
        System.out.println("enter data for right of: "+data);
        root.right=createtree();
        return root;
    }
    public static void main(String[] args) {
        Node root= createtree();
        printtree(root);
    }
}

