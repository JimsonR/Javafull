package SortingAlgorithms;

import java.util.Arrays;

public class TreeSort {

    public static void main(String[] args) {

        int[] arr = { 65, 68, 82, 42, 10, 75, 25, 47, 32, 72 };
        System.out.println("Original array "+ Arrays.toString(arr));
        BinarySearchTree binarySearchTree = new BinarySearchTree(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            binarySearchTree.insert(binarySearchTree.node,arr[i]);
        }
        System.out.println("Sorted array after tree sort- ");

        binarySearchTree.inOrder(binarySearchTree.node);

        System.out.println(Arrays.toString(arr));
    }
}

class Node{
    int value;
    Node left;
    Node right;

    Node(int value){
        this.value = value;
        left = null;
        right = null;
    }
}

class BinarySearchTree {
    Node node;
    BinarySearchTree(int value){
        if(node == null){
            node = new Node(value);
        }
    }

    public Node insert(Node node , int value){
        if(node == null){
            return new Node(value);
        }
        if(value < node.value){
            node.left = insert(node.left,value);
        }
        if(value > node.value){
            node.right = insert(node.right , value);
        }
        return node;
    }

    public void inOrder(Node node){
        if(node != null){
            inOrder(node.left);
            System.out.print(node.value + " ");
            inOrder(node.right);
        }
    }

}

